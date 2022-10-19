
// Andrew Schaefer

// Abstract class
abstract class Division {

    String coDivisionName;
    int coAccountNumber;
 
    public Division(String coDivisionName, int coAccountNumber) {
        this.coDivisionName = coDivisionName;
        this.coAccountNumber = coAccountNumber;
    }

    abstract void display();

}