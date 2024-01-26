package Searching;
/*
 * The time complexity of this code is O(n), where n is the number of elements in the array. This is because the code iterates through each element in the array in a linear manner to check if it matches the desired element.
 * The space complexity of this code is O(1) because it does not use any additional data structures that grow with the size of the input.
 */

public class $1LinearSearch {

    public static void main(String[] args) {
        int[] arr = { 100, -1, 90, -120, 90, 12, -190 };
        int toFind = -190;

        for (int i : arr) {
            if (i == toFind) {
                System.out.format("Found element %d", toFind);
            }

        }
    }

}
