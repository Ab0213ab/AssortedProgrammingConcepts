// Andrew B. Schaefer

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PaycheckHelp
{
    internal class Paycheck
    {
        static double payRate = 40.16;
        static double domesticPerDiemRate = 2.20;
        static double internationalPerDiemRate = 2.50;
        static double taxRate = .75;

        // Calculates paycheck amount based on Paycheck class
        // variables and user input
        public static double calculatePaycheck(double totalHours, 
                                               double domesticPerDiemHours,
                                               double internationalPerDiemHours)
        {
            // CHANGE PREVENTER CODE SMELL? PERHAPS LONG METHOD?
            // NEEDS EXTRACT VARIABLE?
            double paycheckTotal = ((totalHours - 37.5) * payRate) * taxRate +
            (domesticPerDiemHours * domesticPerDiemRate) +
            (internationalPerDiemHours * internationalPerDiemRate);

            return paycheckTotal;
        }

    }
}
