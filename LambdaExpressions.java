
// Andrew Schaefer
// Lambda Expressions

// Imports the necessary packages
import java.util.*;

public class LambdaExpressions {

    // Method declaration
    public static void displayDogs(ArrayList<String>rareDogBreedList) {

        // For each loop iterates through ArrayList and prints each element
        for (String breed: rareDogBreedList) {
            System.out.println(breed);
        }
    }
    
    // Main method
    public static void main(String[] args) {

        // Creates an ArrayList
        ArrayList<String> rareDogBreedList = new ArrayList<>();

        // Adds elements to ArrayList
        Collections.addAll(rareDogBreedList, "Catahoula Leopard Dog", "Thai Ridgeback", 
        "Peruvian Inca Orchid", "Norwegian Lundehund", "Tibetan Mastiff");


        /* WITHOUT USING LAMBDA EXPRESSIONS
        ------------------------------------------------------------------
        ------------------------------------------------------------------*/ 

        // Prints a heading
        System.out.println("Rare Dog Breeds (printed without lambda):");

        // Method call
        displayDogs(rareDogBreedList);

        System.out.println();


        /* USING LAMBDA EXPRESSIONS
        ------------------------------------------------------------------
        ------------------------------------------------------------------*/

        // Prints a heading
        System.out.println("Rare Dog Breeds (printed with lambda):");

        // For each loop iterates through the ArrayList and lambda expression
        // prints each element
        rareDogBreedList.forEach((breed)->System.out.println(breed));

    }
}