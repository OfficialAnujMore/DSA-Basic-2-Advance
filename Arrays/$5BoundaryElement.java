// The time complexity of the code is O(n^2), where n is the size of the matrix. This is because there are nested loops that iterate through each element of the matrix.

// The space complexity of the code is O(1), as there is no additional space used that grows with the input size. The code only uses a constant amount of space to store the matrix.

package Arrays;

public class $5BoundaryElement {
    private static void result(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || j == 0 || (i == matrix.length - 1) || (j == matrix.length - 1)) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int[][] mat1 = { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };
        result(mat1);

    }

}
