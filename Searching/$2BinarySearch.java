package Searching;

/*
 * The time complexity of the binary search algorithm is O(log n), where n is the number of elements in the array. This is because in each iteration, the search space is divided in half, reducing the number of elements to search by half. This results in a logarithmic time complexity.
 * The space complexity of the binary search algorithm is O(1), as it only requires a constant amount of additional space to store the variables for the start, end, and mid indices.
 */

public class $2BinarySearch {

    private int result(int[] arr, int key, int start, int end) {
        if (end >= start) {
            int mid = (start + end) / 2;

            System.out.println(mid + " " + arr[mid] + " " + key);
            if (arr[mid] == key) {

                return mid;
            }

            if (arr[mid] < key)
                return result(arr, key, mid + 1, arr.length);

            return result(arr, key, start, mid - 1);
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        $2BinarySearch obj = new $2BinarySearch();
        System.out.println("Found element at position " + obj.result(arr, 2, 0, arr.length - 1));
    }

}
