// Andrew Schaefer
// 11/13/21
// CSD420
// Module 6 Assignment 
// Mod_6_csd420.java

/**************************************************************************************
* ASSIGNMENT INSTRUCTIONS:                                                            *
* _________________________________________________________________________________   *
*                                                                                     *
* Write a program with the two following generic methods using a bubble sort. The     *
* first method sorts the elements using the Comparable interface, and the second      *
* uses the Comparator interface.                                                      *
*                                                                                     *
* -	public static <E extends Comparable<E>> void bubbleSort(E[] list) {}              *
* -	public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {}  *
*                                                                                     *
* Write test code that ensures the code functions correctly.                          *
*                                                                                     *
**************************************************************************************/

import java.util.*;

public class Mod_6_csd420 {

    // METHOD 1
    // Generic bubble sort method extends Comparable interface
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
      bubbleSort(list, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2));
    }

    // METHOD 2
    // Generic bubble sort method extends Comparator interface
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean needsAnotherIteration = true;

        for (int k = 1; k < list.length && needsAnotherIteration; k++) {
            
            // If array is already sorted then iteration is not needed
            needsAnotherIteration = false;

            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {
				
                    // Swaps list[i] with list[i + 1]
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    // One last pass is needed to confirm elements are sorted
                    needsAnotherIteration = true;

				}
			}
		}
	}

//_________________________________________________________________________________________________
  public static void main(String[] args) {

    // Creates a new list of doubles
    Double[] myDoubleList = {22.2, 301.1, 128.8, 50.5, 76.6, 109.9, 442.2, 13.3, 34.4, 99.9};

    System.out.println("Pre Bubble Sort:");

    // Prints each element in sorted myDoubleList
    for (int i = 0; i < myDoubleList.length; i++) {
      System.out.print(myDoubleList[i] + " ");
      }

    System.out.println();

    // Method call with myDoubleList as argument
    bubbleSort(myDoubleList);

    System.out.println("Post Bubble Sort:");

    // Prints each element in sorted myDoubleList
    for (int i = 0; i < myDoubleList.length; i++) {
        System.out.print(myDoubleList[i] + " ");
        }
      
        System.out.println();
//_________________________________________________________________________________________________

    // Creates a new list of integers
    Integer[] myIntegerList = {22, 301, 128, 50, 76, 109, 442, 13, 34, 99};

    System.out.println("Pre Bubble Sort:");

    // Prints each element in sorted myIntegerList
    for (int i = 0; i < myIntegerList.length; i++) {
      System.out.print(myIntegerList[i] + " ");
      }

    System.out.println();

    // Method call with myIntegerList as argument
    bubbleSort(myIntegerList);

    System.out.println("Post Bubble Sort:");

    // Prints each element in sorted myIntegerList
    for (int i = 0; i < myIntegerList.length; i++) {
      System.out.print(myIntegerList[i] + " ");
    }

    System.out.println();

//_________________________________________________________________________________________________

    // Creates a new list of strings
    String[] myStringList = {"Andrew", "Claudia", "Ollie", "Darrell", "Melony", "Ryan", "Frye"};

    System.out.println("Pre Bubble Sort:");

    // Prints each element in sorted myStringList
    for (int i = 0; i < myStringList.length; i++) {
      System.out.print(myStringList[i] + " ");
      }

      System.out.println();

   // Method call with myStringList as argument
    bubbleSort(myStringList, (s1, s2) -> s1.compareToIgnoreCase(s2));

    System.out.println("Post Bubble Sort:");

    // Prints each element in sorted myStringList
    for (int i = 0; i < myStringList.length; i++) {
      System.out.print(myStringList[i] + " ");
    }
  }
}