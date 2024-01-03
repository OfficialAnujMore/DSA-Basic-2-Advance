package Arrays.Matrix;

public class $1MatrixAddition {

    private void result(int[][] mat1, int[][] mat2) {
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] mat2 = { { 4, 5, 6 }, { 1, 2, 3 } };

        $1MatrixAddition obj = new $1MatrixAddition();
        obj.result(mat1, mat2);

    }

}
