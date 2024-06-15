package CollectionFramework.Stack;

import java.util.*;

public class $3MonotonicStack {

    public static void main(String[] args) {

        int[] arr = { 4, 12, 5, 3, 1, 2, 5, 3, 1, 2, 4, 6 };
        System.out.println(Arrays.toString(arr));

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from the stack while the current element is greater
            // than or equal to the element on the top of the stack
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If the stack is not empty, the top element is the next greater element
            int nextGreater = stack.isEmpty() ? -1 : stack.peek();

            // Store the next greater element in the array itself
            stack.push(arr[i]);
            arr[i] = nextGreater;
        }
        System.out.println(Arrays.toString(arr));

    }

}
