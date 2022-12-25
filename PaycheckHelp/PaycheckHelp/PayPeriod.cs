using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;


namespace PaycheckHelp
{
    [Serializable()]
    internal class PayPeriod
    {
        private double totalHours;
        public double TotalHours 
        { 
            get { return totalHours; } 
            set { totalHours = value; }
        }

        private double domesticPerDiemHours;
        public double DomesticPerDiemHours 
        { 
            get { return domesticPerDiemHours; } 
            set { domesticPerDiemHours = value; }
        }

        private double internationalPerDiemHours;
        public double InternationalPerDiemHours 
        {
            get { return internationalPerDiemHours;}
            set { internationalPerDiemHours = value; }
        }

        private double paychecktotal;
        public double Paychecktotal 
        {
            get { return paychecktotal; }
            set { paychecktotal = value; }
        }

        public double PaycheckTotal { get; internal set; }
    }
}
