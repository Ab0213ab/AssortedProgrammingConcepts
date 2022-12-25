using PaycheckHelp.Properties;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace PaycheckHelp
{
    public partial class SettingsForm : Form
    {
        public SettingsForm()
        {
            InitializeComponent();

        }

        internal static string errorMessageBoxContent = "All fields must be filled with numbers only!";

        private void ClearAllSettingsFields()
        {
            payRateSettingsTextBox.Clear();
            domesticPerDiemSettingsTextBox.Clear();
            internationalPerDiemSettingsTextBox.Clear();
            taxRateSettingsTextBox.Clear();
        }

        // *** ASK MIKE ABOUT METHOD OVERLOADING HERE IN ORDER TO ALLOW
        // CHANGES TO JUST ONE SETTING INSTEAD OF HAVING TO FILL
        // EVERY FIELD JUST TO SAVE ONE SETTING ***

        // Saves each data field as property settings, displays the changes,
        // and restarts the application
        public void SaveSettingsChanges(double newPayRate,
                                double newDomesticPerDiemRate,
                                double newInternationalPerDiemRate,
                                double newTaxRate)
        {
            try
            {
                Properties.Settings.Default.PayRate = newPayRate;
                Properties.Settings.Default.Save();

                Properties.Settings.Default.DomesticPerDiemRate = newDomesticPerDiemRate;
                Properties.Settings.Default.Save();

                Properties.Settings.Default.InternationalPerDiemRate = newInternationalPerDiemRate;
                Properties.Settings.Default.Save();

                Properties.Settings.Default.TaxRate = newTaxRate;
                Properties.Settings.Default.Save();

                string changeMessage = "The following setting changes have been made: \n";
                List<string> SettingsList = new List<string>() {"New Pay Rate: $" + newPayRate.ToString("f2"),
                                                                "New Domestic Per Diem Rate: $" + newDomesticPerDiemRate.ToString("f2"),
                                                                "New International Per Diem Rate: $" + newInternationalPerDiemRate.ToString("f2"),
                                                                "New Tax Rate: " + newTaxRate.ToString("f2")};
                string delimiter = ", \n";
                string messageBoxContent = changeMessage + String.Join(delimiter, SettingsList);

                MessageBox.Show(messageBoxContent);
                Application.Restart();

            }
            catch (System.FormatException)
            {
                ClearAllSettingsFields();
                MessageBox.Show(errorMessageBoxContent);
            }

        }
        // Accesses TextBox data as args for SaveSettingsChanges()
        private void btn_save_Click(object sender, EventArgs e)
        {
            try
            {
                double newPayRate = double.Parse(payRateSettingsTextBox.Text);
                double newDomesticPerDiemRate = double.Parse(domesticPerDiemSettingsTextBox.Text);
                double newInternationalPerDiemRate = double.Parse(internationalPerDiemSettingsTextBox.Text);
                double newTaxRate = double.Parse(taxRateSettingsTextBox.Text);

                SaveSettingsChanges(newPayRate,
                                    newDomesticPerDiemRate,
                                    newInternationalPerDiemRate,
                                    newTaxRate);
            }
            catch (System.FormatException)
            {
                ClearAllSettingsFields();
                MessageBox.Show(errorMessageBoxContent);
            }
        }

        private void btn_clear_settings_Click(object sender, EventArgs e)
        {
            ClearAllSettingsFields();
        }

        //private void SettingsForm_FormClosing(object sender, FormClosingEventArgs e)
        //{
        //    string logMessage = "Do you want to save your settings?";

        //    if (payRateSettingsTextBox.Text.Length > 0)
        //    {
        //        if (MessageBox.Show(logMessage, "Paycheck Helper",
        //            MessageBoxButtons.YesNo) == DialogResult.Yes)
        //        {
        //            // Cancel the Closing event from closing the form.
        //            e.Cancel = true;
        //            // Call method to save file...
        //        }
        //    }
        //}
    }
}
