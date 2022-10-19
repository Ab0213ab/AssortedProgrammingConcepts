/* 

Andrew B. Schaefer

Goal: You are given an integer array nums. The unique elements of an 
array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.
(LeetCode #1748)

*/

import java.util.*;

public class SumUniqueElements {

    public static int addUpAllTheUniqueElements(int[] nums) {

        Arrays.sort(nums);

        // Array to hold unique elements
        //ArrayList<Integer> uniqueElements = new ArrayList<Integer>();

        int sum = 0;

        // Traverses nums to determine if each element is unique or not
        // and if it is, adds it to sum
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        // Test Case #1:
        int[] nums = {21, 3, 3, 3, 50, 7, 11, 133, 11, 18};
        System.out.println(addUpAllTheUniqueElements(nums));

        // Test Case #2:
        int[] nums2 = {21, 77, 38, 50, 218, 77, 7, 101, 13, 11, 218};
        System.out.println(addUpAllTheUniqueElements(nums2));

        // Test Case #3:
        int[] nums3 = {1, 3, 3, 3, 2, 3};
        System.out.println(addUpAllTheUniqueElements(nums3));
    }
}
