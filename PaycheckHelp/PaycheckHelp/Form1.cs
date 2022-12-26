// Andrew B. Schaefer

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using static System.Windows.Forms.VisualStyles.VisualStyleElement;
using static PaycheckHelp.PayPeriod;
using System.IO;
using System.Xml.Serialization;
using System.Reflection;
//using static PaycheckHelp.MyGlobals;

namespace PaycheckHelp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

        }

        // Clears all form data
        private void ClearAllForm1Fields()
        {
            totalHoursTextBox.Clear();
            domesticPerDiemTextBox.Clear();
            internationalPerDiemTextBox.Clear();
            paycheckAmountTextBox.Clear();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        // Accesses TextBox data and uses it as args for calculatePaycheck() 
        private void btn_calculate_Click(object sender, EventArgs e)
        {
            try
            {
                double totalHours = double.Parse(totalHoursTextBox.Text);
                double domesticPerDiemHours = double.Parse(domesticPerDiemTextBox.Text);
                double internationalPerDiemHours = double.Parse(internationalPerDiemTextBox.Text);
                double paycheck = Paycheck.calculatePaycheck(totalHours, domesticPerDiemHours,
                                                             internationalPerDiemHours);

                PayPeriod pp = new PayPeriod
                {
                    TotalHours = totalHours,
                    DomesticPerDiemHours = domesticPerDiemHours,
                    InternationalPerDiemHours = internationalPerDiemHours,
                    Paychecktotal = paycheck
                };


                paycheckAmountTextBox.Text += "~ $" + pp.Paychecktotal;
                logPaycheckAmount(pp);
            }

            // Handles exceptions for both empty fields and invlaid input
            catch (System.FormatException)
            {
                MessageBox.Show(SettingsForm.errorMessageBoxContent);
                ClearAllForm1Fields();
            }
        }

        // Clears all form data
        private void btn_clear_Click(object sender, EventArgs e)
        {
            ClearAllForm1Fields();
        }

        private void btn_settings_Click(object sender, EventArgs e)
        {
            SettingsForm settForm = new SettingsForm();
            settForm.ShowDialog();
        }



        /***UNFINISHED METHOD. WILL REPLACE AUTO LOGGING OF PAYPERIOD DATA***/

        // Gives user the chance to log paycheck data
        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            string logMessage = "Do you want to log your paycheck estimation?";

            // Checks if there is data to save
            if (paycheckAmountTextBox.Text.Length > 0)
            {
                if (MessageBox.Show(logMessage, "Paycheck Helper",
                    MessageBoxButtons.YesNo) == DialogResult.Yes)
                {
                    // Cancel the Closing event to stop the form from closing.
                    e.Cancel = true;

                    //logPaycheckAmount(pp);
                }
            }

        }


        // Creates a file path and .txt file on users machine (if they exist),
        // and serializes the PayPeriod object data
        private void logPaycheckAmount(object payperiod)
        {
            string pathString = @"C:\PaycheckHelper\PaycheckLog";
            System.IO.Directory.CreateDirectory(pathString);

            string dateStr = DateTime.Now.ToString("yyyyddMM");

            string fileName = dateStr + ".xml";
            string pathString2 = System.IO.Path.Combine(pathString, fileName);

            if (!System.IO.File.Exists(pathString2))
            {
                System.IO.File.Create(pathString2).Close();
            }
 
            using (FileStream fs = File.Open(pathString2, FileMode.Open, FileAccess.Write, FileShare.None))
            {
                // Serialization code
                System.Xml.Serialization.XmlSerializer writer =
                    new System.Xml.Serialization.XmlSerializer(typeof(PayPeriod));

                writer.Serialize(fs, payperiod);
                fs.Close();
            }
            displayAndDerializeData(pathString, fileName);
        }



        // Deserializes XML file data and displays the logged PayPeriod object data to the user
        private void displayAndDerializeData(string pathString, string fileName) 
        {

             pathString = System.IO.Path.Combine(pathString, fileName);

             XmlSerializer serializer = new XmlSerializer(typeof(PayPeriod));
             serializer.UnknownNode += new XmlNodeEventHandler(serializer_UnknownNode);
             serializer.UnknownAttribute += new XmlAttributeEventHandler(serializer_UnknownAttribute);

            FileStream fs = new FileStream(pathString, FileMode.Open);

            PayPeriod pp;
            using (StreamReader reader = new StreamReader(@fs))
            {
                pp = (PayPeriod)serializer.Deserialize(reader);
                reader.Close();
            }

             string logMessage = "The following data was logged: \n";
             List<string> LogList = new List<string>() {"Total Hours: " + pp.TotalHours.ToString(),
                                                                "Domestic Per Diem Hours: " + pp.DomesticPerDiemHours.ToString(),
                                                                "International Per Diem Hours: " + pp.InternationalPerDiemHours.ToString(),
                                                                "Paycheck Total: " + pp.Paychecktotal.ToString()};
             string delimiter = ", \n";
             string messageBoxContent = logMessage + String.Join(delimiter, LogList);

             MessageBox.Show(messageBoxContent);
        }






        private void serializer_UnknownAttribute(object sender, XmlAttributeEventArgs e)
        {
            throw new NotImplementedException();
        }

        private void serializer_UnknownNode(object sender, XmlNodeEventArgs e)
        {
            throw new NotImplementedException();
        }
    }
 
}
