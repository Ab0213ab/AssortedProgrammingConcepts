/*

Andrew Schaefer

You are given an array of strings names, and an array heights that 
consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and
height of the ith person.

Return names sorted in descending order by the people's heights.
(LeetCode #2418)

*/

import java.util.*;

public class SortThePeople {

    public static String[] sortPeople(String[] names, int[] heights) {

        // Creates HashMap with heights list as keys and names list as values
        HashMap<Integer, String> hash = new HashMap<Integer, String>();
        for (int i = 0; i < names.length; i++) {
            hash.put(heights[i], names[i]);
        }
        // Sorts heights list so they are in ascending order
        Arrays.sort(heights);

        // New list to hold sorted names
        String[] result = new String[heights.length];
        int index = 0;

        // Works backwards through sorted list heights (so result will be in descending order)
        // Then - 
        // Adds the values from HashMap to result list by accessing the keys
        for (int i = heights.length - 1; i >= 0; i--) {
            result[index] = hash.get(heights[i]);
            index++;
        }
        return result;
    }


    public static void main(String[] args) {

        // Test Case
        String[] names = {"Claudia", "Andrew", "Ollie"};
        int[] heights = {100, 50, 1};

        for (String n : sortPeople(names, heights)) {
            System.out.println(n);
        }
    }
}