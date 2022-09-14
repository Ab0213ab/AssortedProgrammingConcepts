// Andrew Schaefer

/***********************************************************************************
* ASSIGNMENT INSTRUCTIONS:                                                         *
* _________________________________________________________________________________*
*                                                                                  *
* Write a test program that reads words from a text file and displays all non-     *
* duplicate words in ascending order and then in descending order.                 *
* -	The file is to be referenced in the program, not needing to be used as a       *
*    command line reference.                                                       *
* -	The word file is to be titled collection_of_words.txt.                         *
* Write test code that ensures the code functions correctly.                       *
*                                                                                  *
***********************************************************************************/

import java.util.*;
import java.io.*;


public class PrintToFileIO {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

         // Creates new file named collection_of_words.txt if file does not already exist  
         try {
            
            // Creates new File object
            File myFile = new File("collection_of_words.txt"); 
            // Determines if file already exists and if not, creates it
            if (myFile.createNewFile()) {  
              System.out.println("File created: " + myFile.getName());  
            } 
            else {  
              System.out.println("File already exists.");  
            }  
        }
        // Handles exception
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();  
        } 

// __________________________________________________________________________

        // Initializes strings to add to file
        String fruit_1 = "cherry";
        String fruit_2 = "banana";
        String fruit_3 = "apple";
        String fruit_4 = "cherry";
        String fruit_5 = "apple";

        // Writes elements to file 
        try (PrintWriter out = new PrintWriter(new FileOutputStream("collection_of_words.txt"), true)) {
          out.println(fruit_1);
          out.println(fruit_2);
          out.println(fruit_3);
          out.println(fruit_4);
          out.println(fruit_5);
        }

        System.out.println("The elements added to the file are: " + fruit_1 + ", " + fruit_2 + ", " + fruit_3 +
        ", " + fruit_4 + ", " + fruit_5);

// __________________________________________________________________________

        File myFile = new File("collection_of_words.txt");
        Scanner myScanner =  new Scanner(myFile);

        TreeSet<String>myTreeSet = new TreeSet<>();

        // Adds elements to TreeSet to remove duplicates
        while(myScanner.hasNextLine()) {
          myTreeSet.add(myScanner.nextLine());
        }
        myScanner.close();

// __________________________________________________________________________

        // Displays the elements in ascending order
        System.out.println("Ascending order with no duplicates: " + myTreeSet);
        // Displays the elements in descending order
        System.out.println("Descending order with no duplicates: " + myTreeSet.descendingSet());

    }
}