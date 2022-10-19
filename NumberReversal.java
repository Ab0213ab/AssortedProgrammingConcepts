/*

Andrew Schaefer

Write a program that when given an input number, the program returns 
the number in reverse order. Example: an input of 3956 should return 6593.

*/

public class NumberReversal {

    public static int reverseNumber(int number) {

        int remainder, revNumber = 0;
        
        System.out.println("Number pre-reversal: " + number);
        while(number > 0) {
            remainder = number % 10; 
            revNumber = (revNumber * 10) + remainder;
            number /= 10; 
        }
        return revNumber;
    }

    public static void main(String[] args) {

        System.out.println("Number post-reversal: " + reverseNumber(123));
    }
}
