// Andrew Schaefer
// FirstThread.java

/**************************************************************************************
* ASSIGNMENT INSTRUCTIONS:                                                            *
* ___________________________________________________________________________________ *
*                                                                                     *
* Create a class titled <your first name here> ThreeThreads. Use three threads to     *
* output three types of characters to a text area for display.                        *
*                                                                                     *
* -	THREAD 1: output random characters like a, b, c, d, …                             *
* -	THREAD 2: output random digits like 0, 1, 2, 3, …                                 *
* - THREAD 3: output random characters like !, @, #, $, …                             *
*                                                                                     *                              *
* Write test code that ensures the code functions correctly.                          *
*                                                                                     *
**************************************************************************************/

import java.util.*;

public class FirstThread extends Thread {
    @Override
    public void run() {

        String myString = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        ArrayList<Character> myChars = new ArrayList<Character>();

        // Divides string into characters and adds them to the ArrayList 
        for (int i = 0; i < myString.length(); i++) {
            myChars.add(myString.charAt(i));
        }

        // Displays a random character from the ArrayList 10,000 times
        for (int i = 0; i < 10; i++) {
            Collections.shuffle(myChars);
            System.out.println("From Thread #1: " + myChars.get(0));
        }
        
        System.out.println("Thread #1 is finished.");

    }
}