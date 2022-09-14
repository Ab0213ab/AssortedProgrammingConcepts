// Andrew Schaefer

/***********************************************************************************
Assignment instructions:                                                           *
Write a test program that stores 50,000 integers in LinkedList and test the time   * 
to traverse the list using an iterator vs. using the get(index) method.            *
                                                                                   *
Then, test your program storing 500,000 integers.                                  *
                                                                                   *
After completing this program and having tested both values, in your comments,     *
explain the results and discuss the time taken using both values and their         *
difference with the get(index) approach. (See bottom for analysis)                 *
                                                                                   *
Write test code that ensures the code functions correctly.                         *
                                                                                   *
***********************************************************************************/

import java.util.*;


public class IteratorVsGetMethod {
    public static void main(String[] args) {

        // Creates a new LinkedList
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();

        // Creates new random number object
        Random rand = new Random();
        // Variable represents highest value for random numbers
        int upperbound = 10;
        
        // While loop controls size of the ArrayList
        while (myLinkedList.size() < 49999) {
            int int_random = rand.nextInt(upperbound);
            // Adds integer if it is not 0
            if (int_random > 0) {
                myLinkedList.add(int_random);
            }
        }

        // Creates a new Iterator object
        ListIterator<Integer> myListIterator = myLinkedList.listIterator();

        long start1 = System.currentTimeMillis();

        // Traversal using iterator to print each element
        for (int counter = 0; counter < myLinkedList.size(); counter++) {
            if (myListIterator.hasNext()) {
                int next = myListIterator.next();
                System.out.println(next);
            }
        }

        long finish1 = System.currentTimeMillis();
        long timeElapsed1 = finish1 - start1;

        System.out.println("Traversal of 50,000 elements with iterator finished in " 
        + timeElapsed1 + " milliseconds."); // 3612 milliseconds.

        // Pauses program for 5 seconds between traversal methods to allow 
        // for the recording of the time elapsed
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long start2 = System.currentTimeMillis();

        // Traversal using get(index) method to print each element
        for (int counter = 0; counter < myLinkedList.size(); counter++) {
            System.out.println(myLinkedList.get(counter));
        }

        long finish2 = System.currentTimeMillis();
        long timeElapsed2 = finish2 - start2;
        
        System.out.println("Traversal of 50,000 elements with get(index) method finished in " 
        + timeElapsed2 + " milliseconds."); // 4659 milliseconds.

        // Pauses program for 5 seconds between traversal methods to allow 
        // for the recording of the time elapsed
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

// ___________________________________________________________________________________________________

        // Creates a new LinkedList
        LinkedList<Integer> myLinkedList2 = new LinkedList<Integer>();

        // Creates new random number object
        Random rand2 = new Random();
        // Variable represents highest value for random numbers
        int upperbound2 = 10;
        
        // While loop controls size of the ArrayList
        while (myLinkedList2.size() < 499999) {
            int int_random2 = rand2.nextInt(upperbound2);
            // Adds integer if it is not 0
            if (int_random2 > 0) {
                myLinkedList2.add(int_random2);
            }
        }

        // Creates a new Iterator object
        ListIterator<Integer> myListIterator2 = myLinkedList2.listIterator();

        long start3 = System.currentTimeMillis();

        // Traversal using iterator to print each element
        for (int counter = 0; counter < myLinkedList2.size(); counter++) {
            if (myListIterator2.hasNext()) {
                int next = myListIterator2.next();
                System.out.println(next);
            }
        }

        long finish3 = System.currentTimeMillis();
        long timeElapsed3 = finish3 - start3;

        System.out.println("Traversal of 500,000 elements with iterator finished in " 
        + timeElapsed3 + " milliseconds."); // 66213 milliseconds.

        // Pauses program for 5 seconds between traversal methods to allow 
        // for the recording of the time elapsed
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long start4 = System.currentTimeMillis();

        // Traversal using get(index) method to print each element
        for (int counter = 0; counter < myLinkedList2.size(); counter++) {
            System.out.println(myLinkedList2.get(counter));
        }

        long finish4 = System.currentTimeMillis();
        long timeElapsed4 = finish4 - start4;
        
        System.out.println("Traversal of 500,000 elements with get(index) method finished in " 
        + timeElapsed4 + " milliseconds."); // 530620 milliseconds.

    }
} 

/* What this program demonstrates is how much faster traversing a LinkedList is
with an Iterator as compared to the get() method. The program first creates a
LinkedList with 50,000 integers and then with 500,000 integers and the traversal 
time taken for each scenario are as follows:

           Iterator:          *     get():
_____________________________ * ___________________________           
- 50,000   3612 milliseconds  *  4659 milliseconds
                              *
- 500,000  66213 milliseconds *  530620 milliseconds       
______________________________*_____________________________

The get() method took over eight minutes to traverse the 500,000 element LinkedList
while the Iterator only took a little over one. When working with smaller sized 
LinkedLists it is difficult to notice how much slower the get() method is than the 
Iterator. However, when working with collections with a large number of elements 
like the ones in this program, it is easy to see the benefits of using the Iterator
over the get() method. */