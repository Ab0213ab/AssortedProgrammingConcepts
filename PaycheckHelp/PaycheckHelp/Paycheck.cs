// Andrew B. Schaefer

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//using static PaycheckHelp.PayPeriod;

namespace PaycheckHelp
{
    internal class Paycheck
    {
        // Ensures no hard coded values as data is saved in properties
        static double payRate = Properties.Settings.Default.PayRate;
        static double domesticPerDiemRate = Properties.Settings.Default.DomesticPerDiemRate;
        static double internationalPerDiemRate = Properties.Settings.Default.InternationalPerDiemRate;
        static double taxRate = Properties.Settings.Default.TaxRate;


        // Calculates paycheck amount based on Paycheck class
        // fields and user input.
        public static double calculatePaycheck(double totalHours, 
                                               double domesticPerDiemHours, 
                                               double internationalPerDiemHours)
        {

            // This calculator is for the 2nd paycheck of the month only
            // so 37.5 hours are subtracted right away.

            // Per Diem is untaxed
            double paycheckTotal = ((totalHours - 37.5) * payRate) * taxRate +
            (domesticPerDiemHours * domesticPerDiemRate) +
            (internationalPerDiemHours * internationalPerDiemRate);

            return paycheckTotal;
        }

    }
}
