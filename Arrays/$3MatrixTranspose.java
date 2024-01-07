
/*
 * The time complexity of the algorithm is O(n^2), where n is the size of the matrix. This is because we iterate through each element of the matrix twice - once to print the original matrix and once to perform the transpose operation.
 * The space complexity of the algorithm is O(1) because we are not using any additional space that grows with the input size. We are only using a constant amount of space to store temporary variables during the transpose operation.
 */

package Arrays;

public class $3MatrixTranspose {

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");

        }
    }

    private void result(int[][] matrix) {
        System.out.println("Original matrix");
        printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {

                // System.out.format("matrix[%d][%d] value is ===> %d ", i, j, matrix[i][j]);
                // System.out.format("matrix[%d][%d] value is ===> %d ", j, i, matrix[j][i]);
                // System.out.println("");
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }

        }

        System.out.println("Transpose matrix");
        printMatrix(matrix);
    }

    public static void main(String[] args) {

        int[][] matrix = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        $3MatrixTranspose obj = new $3MatrixTranspose();
        obj.result(matrix);

    }

}
