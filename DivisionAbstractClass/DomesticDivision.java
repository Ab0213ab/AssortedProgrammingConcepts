
// Andrew Schaefer

// Subclass that inherits from the Division class
class DomesticDivision extends Division {

    String co_division_state;

    public DomesticDivision(String coDivisionName, int coAccountNumber, String coDivisionState) {
        super(coDivisionName, coAccountNumber);
        this.coDivisionState = coDivisionState;
        
    }

    // Displays all values
    public void display() {
        System.out.println("Division name is: " + this.coDivisionName);
        System.out.println("Account number is: " + this.coAccountNumber);
        System.out.println("Division state is: " + this.coDivisionState);
    }  
}