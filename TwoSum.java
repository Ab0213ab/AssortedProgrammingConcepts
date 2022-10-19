/*

Andrew B. Schaefer

Given an array of integers nums and an integer target, return indices of the
two numbers such that they add up to target. You may assume that each input 
would have exactly one solution, and you may not use the same element twice.
(LeetCode #1)

*/


public class TwoSum {

    // Traverses Array and sums each element with all 
    // other elements to find a target value
    public static void sumNum(int[] nums, int target) {

        int result = 0;
        int return1 = 0;
        int return2 = 0;

       for(int i = 0; i < nums.length; i++ ) {
            for(int j = 0; j < nums.length; j++) {
                // Keeps element from summing itself
                if (nums[i] == nums[j]) {
                    continue;
                }
                // If target reached, loops terminates
                result = nums[i] + nums[j];
                if (result == target) {
                    return1 = i;
                    return2 = j;
                    break;
                }
            }
       } 
        System.out.println(return2 + ", " + return1);
    }



    public static void main(String[] args) {

        // Test case 1:
        int[] nums = {1, 2, 3};
        int target = 3;
        sumNum(nums, target);

        // Test case 2:
        int[] nums2 = {20, 30, 40};
        int target2 = 50;
        sumNum(nums2, target2);

        // Test case 2:
        int[] nums3 = {3, 6, 9, 12};
        int target3 = 21;
        sumNum(nums3, target3);

    }
}
