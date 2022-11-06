// Andrew Schaefer

public class Paycheck {

    double totalHours;
    static double payRate = 40.16;

    static double domesticPerDiemRate = 2.20;
    double domesticPerDiemHours;

    static double internationalPerDiemRate = 2.50;
    double internationalPerDieHours;

    static double taxRate = .75;

    public static double calculatePaycheck(double totalHours, double domesticPerDiemHours, 
                                  double internationalPerDiemHours) {

        double paycheckTotal = ((totalHours - 37.5) * payRate) * taxRate + 
        (domesticPerDiemHours * domesticPerDiemRate) + 
        (internationalPerDiemHours * internationalPerDiemRate);

        return paycheckTotal;
    }

}