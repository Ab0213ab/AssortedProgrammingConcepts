/*
Andrew Schaefer

Goal: Given a sorted array of distinct integers and a target 
value, return the index if the target is found. If not, return 
the index where it would be if it were inserted in order.
(LeetCode #35)

*/

public class ArrayAndTarget {

        public static void searchInsert(int[] numbers, int target) {

            for (int i = 0; i < numbers.length; i++) {
                if (target == numbers[i]) {
                    System.out.println("The target " + target + " was found at index: " + i);
                    break;
                } else if (target > numbers[i]) {
                    continue;
                } else if (target < numbers[i]) {
                    System.out.println("The target " + target + " would be inserted at index: " + i);
                    break;
                }
            }       
        }


    public static void main(String[] args) {

        int target = 0;
        int[] numbers = {1, 2, 4};

        searchInsert(numbers, target);
    }  
}

