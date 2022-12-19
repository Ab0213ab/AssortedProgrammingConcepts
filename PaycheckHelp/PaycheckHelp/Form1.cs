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

namespace PaycheckHelp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_calculate_Click(object sender, EventArgs e)
        {
            // MOVE TRY/CATCH TO METHOD?
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
                paycheckAmountTextBox.Text += "All fields must be filled with numbers only!";
            }
        }

        // Clears all form data
        private void btn_clear_Click(object sender, EventArgs e)
        {
                totalHoursTextBox.Clear();
                domesticPerDiemTextBox.Clear();
                internationalPerDiemTextBox.Clear();
                paycheckAmountTextBox.Clear();
        }
    }
}
