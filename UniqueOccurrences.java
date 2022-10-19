/*

Andrew B. Schaefer

Given an array of integers arr, return true if the number of occurrences 
of each value in the array is unique, or false otherwise.
(LeetCode #1207)

*/

import java.util.*;

public class UniqueOccurrences {

    public static boolean checkOccurrences(int[] arr) {

        Arrays.sort(arr);

        List<Integer> list = new ArrayList();

        int count = 1;

        // Loops through array and increases count each time the ith element occurs.
        // Count is then added to new list
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } 
            else {
                list.add(count);
                count = 1;
            }
        }
        list.add(count);

        Set<Integer> set =  new HashSet<>(list);

        // Since HashSet removes duplicates, if list and set are equal in size,
        // then there must be a unique number of occurrences for each value. 
        return list.size() == set.size();
    }     

    public static void main(String[] args) {

        // Test Case #1:
        int[] arr = {1, 2, 2, 3, 3, 3};
        System.out.println(checkOccurrences(arr)); // true

        // Test Case #2:
        int[] arr2 = {7, 7, 6, 6, 1, 1};
        System.out.println(checkOccurrences(arr2)); // false

    }
}
