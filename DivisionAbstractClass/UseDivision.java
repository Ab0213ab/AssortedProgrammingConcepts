
// Andrew Schaefer

/*1.	Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.
2.	Use a constructor in the superclass that requires values for both fields.
3.	Create two subclasses named InternationalDivision and DomesticDivision.
•	The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
•	The DomesticDivision class includes a field for the state in which the division is located and a constructor that requires all fields when created.
4.	Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
5.	Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
 */

public class UseDivision {
 
    public static void main(String[] args) {

    //4 instances of the concrete classes    
    InternationalDivision obj_1 = new InternationalDivision("Superclass International", 5377769, "France", "French");
    InternationalDivision obj_2 = new InternationalDivision("Interfaces Incorporated", 4207995, "Venezuela", "Spanish");
    DomesticDivision obj_3 = new DomesticDivision("Polymorphism & Co", 7775230, "Florida");
    DomesticDivision obj_4 = new DomesticDivision("The Method Overriders Corporation", 6068643, "Montana");

    obj_1.display();
    obj_2.display();
    obj_3.display();
    obj_4.display();

    }
}