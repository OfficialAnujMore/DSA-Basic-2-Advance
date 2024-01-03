package Recurssion;

public class $5BinarySearch {

    private int result(int[] arr, int start, int end, int ele) {
        int mid = (start + end) / 2;
        System.out.format("Mid = %d start = %d end = %d \n", mid, start, end);
        if (start > end)
            return -1;

        if (arr[mid] == ele)
            return arr[mid];

        if (ele > arr[mid])
            return result(arr, mid + 1, end, 5);

        return result(arr, start, mid - 1, 5);
    }

    public static void main(String[] args) {
        $5BinarySearch obj = new $5BinarySearch();
        int[] arr = { 0, 1, 2, 3, 4, 5, 6 };

        System.out.format("Result of is %d ", obj.result(arr, 0, arr.length - 1, 5));
    }

}
