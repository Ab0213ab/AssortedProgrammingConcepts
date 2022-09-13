// Andrew Schaefer
// SecondThread.java

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
import java.util.concurrent.ThreadLocalRandom;

public class SecondThread extends Thread {

    @Override
    public void run() {

        // Displays a random number 10,000 times
        for (int i = 0; i < 10; i++) { 
            int myRandomInt = ThreadLocalRandom.current().nextInt(0,9);
            System.out.println("From Thread #3: " + myRandomInt);
        }

        System.out.println("Thread #2 is finished.");
    }
}