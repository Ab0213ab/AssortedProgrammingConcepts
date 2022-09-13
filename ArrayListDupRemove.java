// Andrew Schaefer
// 10/30/21
// CSD420
// Module 3 Assignment 

/***********************************************************************************
Assignment instructions:                                                           *
Write a test program that contains a static method that returns a new ArrayList.   *
-	The new ArrayList returned will contain all original values with no duplicates * 
from the original ArrayList.                                                       *
-	Fill the Original ArrayList with 50 random values from 1 to 20.                *
-	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)             *
Write test code that ensures the code functions correctly.                         *
                                                                                   *
***********************************************************************************/

import java.util.*;

public class ArrayListDupRemove {
    public static void main(String[] args) {

        // Creates an ArrayList named myArrayList
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        // Creates new random number object
        Random rand = new Random();
        // Variable represents highest value for random numbers
        int upperbound = 20;

        // While loop controls size of the ArrayList
        while (myArrayList.size() < 49) {
            int int_random = rand.nextInt(upperbound);
            // Adds integer if it is not 0
            if (int_random > 0) {
                myArrayList.add(int_random);
            }
        }

        System.out.println("Before duplicate removal: " + myArrayList);
        System.out.println();
        System.out.println("After duplicate removal: " + removeDuplicates(myArrayList));
    }

// ______________________________________________________________________________________

    // Generic method declaration
    public static <E> ArrayList removeDuplicates(ArrayList <E> list) {

        // Creates new LinkedHashSet with elements from ArrayList to remove duplicates
        LinkedHashSet<E> myArrayListSansDuplicates = new LinkedHashSet<E>();
        myArrayListSansDuplicates.addAll(list);

        // Creates new ArrayList with elements from the LinkedHashSet
        ArrayList<E> newArrayList = new ArrayList<E>();
        newArrayList.addAll(myArrayListSansDuplicates);
    
        return newArrayList;
    }
}