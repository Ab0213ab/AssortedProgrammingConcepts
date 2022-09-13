// Andrew Schaefer
// ThirdThread.java

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
*                                                                                     *
* Display a minimum of 10,000 of each of the three sets.                              *
* Write test code that ensures the code functions correctly.                          *
*                                                                                     *
**************************************************************************************/

import java.util.*;

public class ThirdThread extends Thread {

    @Override
    public void run() {

        String mySpecialString = new String("!@#$%^&*+~");
        ArrayList<Character> mySpecialChars = new ArrayList<Character>();

        // Divides string into characters and adds them to the ArrayList 
        for (int i = 0; i < mySpecialString.length(); i++) {
            mySpecialChars.add(mySpecialString.charAt(i));
        }

        // Displays a random special character from the ArrayList 10,000 times
        for (int i = 0; i < 10; i++) {
            Collections.shuffle(mySpecialChars);
            System.out.println("From Thread #3: " + mySpecialChars.get(0));
        }
        
        System.out.println("Thread #3 is finished.");

    }
}
