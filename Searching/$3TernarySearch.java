package Searching;
/*
 * The time complexity of the Ternary Search algorithm is O(log3(n)), where n is the size of the array. This is because in each recursive call, the array is divided into three parts, reducing the search space by a factor of 3. Therefore, the number of recursive calls required to find the key is logarithmic with base 3.
 * The space complexity of the Ternary Search algorithm is O(log3(n)). This is because the recursive calls consume space on the call stack, and the maximum depth of the call stack is logarithmic with base 3.
 */

public class $3TernarySearch {

    private int result(int[] arr, int key, int start, int end) {
        if (end >= start) {

            int mid1 = start + (end - start) / 2;
            int mid2 = end - (end - start) / 2;

            if (arr[mid1] == key)
                return mid1;

            if (arr[mid2] == key)
                return mid2;
            if (key < arr[mid1])
                return result(arr, key, start, mid1 - 1);
            else if (key > arr[mid2])
                return result(arr, key, mid2 + 1, end);
            else
                return result(arr, key, mid1 + 1, mid2 - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int start = 0;
        int end = arr.length;
        $3TernarySearch obj = new $3TernarySearch();
        System.out.println("Found element at position " + obj.result(arr, 6, start, end - 1));
    }

}
