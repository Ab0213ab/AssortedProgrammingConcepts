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

        /* 
         * Create a PayPeriod class using Form1 text boxes as values
         * Instantiate new obj w/ Form1 text boxes on button click
         * Pass the object to CalculatePaycheck()
         * Access values using obj.totalHours syntax
         */

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

                paycheckAmountTextBox.Text += "~ $" + paycheck;
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

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void btn_settings_Click(object sender, EventArgs e)
        {
            SettingsForm settForm = new SettingsForm();
            settForm.ShowDialog();
        }

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

                    // METHOD DOES NOT EXIST YET:
                    // logPaycheckAmount(paycheckAmountTextBox.Text);
                }
            }

        }
    }
}
