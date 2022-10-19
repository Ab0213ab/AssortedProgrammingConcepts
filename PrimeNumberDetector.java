/* 

Andrew B. Schaefer

Goal: Write a function called primeNumberDetector that 
tests if a given number is a prime number.

*/

import java.util.Scanner;

public class PrimeNumberDetector {
 

    public static boolean primeNumDetect(int num) {
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int num = 100;
        
        if (primeNumDetect(num) == false) {
            System.out.println("Not prime");
        } else if (primeNumDetect(num) == true) {
            System.out.println("Is prime");
        }

    }
}
