
// Andrew Schaefer


// Subclass that inherits from the Division class
class InternationalDivision extends Division {

    String coDivisionCountry;
    String languageSpoken;

    public InternationalDivision(String coDivisionName, int coAccountNumber, String coDivisionCountry, String languageSpoken) {
        super(coDivisionName, coAccountNumber);
        this.coDivisionCountry = coDivisionCountry;
        this.languageSpoken = languageSpoken;
        
    }

    // Displays all values
    public void display() {
        System.out.println("Division name is: " + this.coDivisionName);
        System.out.println("Account number is: " + this.coAccountNumber);
        System.out.println("Division country is: " + this.coDivisionCountry);
        System.out.println("Language spoken is: " + this.languageSpoken); 
    }
}