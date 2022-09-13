// Andrew Schaefer
// SchaeferThreeThreads.java

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

public class SchaeferThreeThreads extends Thread {

    public static void main(String[] args) {

        // Creates new Thread objects
        FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();
        ThirdThread thread3 = new ThirdThread();

        // Starts Threads
        thread1.start();
        thread2.start();
        thread3.start();

    }
}





