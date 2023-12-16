public class $12TrianglePyramid {

    private static void printPattern(int n) {

        int i, j;

        for (i = 0; i < n; i++) {

            for (j = 0; j < n - (i + 1); j++) {
                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }

    }

    public static void main(String[] args) {
        printPattern(6);
    }

}
