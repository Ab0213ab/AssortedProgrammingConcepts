/*

Andrew Schaefer

Given a string s consisting of words and spaces, return the length 
of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
(LeetCode #58)

*/

import java.util.*;

public class LengthOfLastWord {

   public static int calculateLengthOfLastWord(String s) {

        int count = 0;
        s = s.trim();

        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
            } else break;
        }
        return count;
    }


    public static void main(String[] args) {

        // Test Case #1:
        String s = "Hi there";
        System.out.println(calculateLengthOfLastWord(s));

        // Test Case #2:
        String s2 = "   You did it correctly   ";
        System.out.println(calculateLengthOfLastWord(s2));

        // Test Case #3:
        String s3 = "Superman";
        System.out.println(calculateLengthOfLastWord(s3));

    }
}
