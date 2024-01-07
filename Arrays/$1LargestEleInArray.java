/*
 * The time complexity of this code is O(n), where n is the length of the input array. 
 * This is because the code iterates through each element in the array once to find the maximum element.
 * 
 * The space complexity of this code is O(1) because it only uses a constant amount of additional 
 * space to store the maximum element.
 */

package Arrays;

public class $1LargestEleInArray {

    private double result(double[] arr) {
        double maxEle = Double.MIN_VALUE;

        for (double d : arr) {
            if (d > maxEle) {
                maxEle = d;
            }

        }

        return maxEle;
    }

    public static void main(String[] args) {
        double[] arr = { 1000, -0.1, 0.2, 0.1, 100.0, 0.9, 99 };
        $1LargestEleInArray obj = new $1LargestEleInArray();
        System.out.format("Max ele in array is %.2f", obj.result(arr));

    }

}
