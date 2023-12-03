// *                     * 
// * *                 * *
// * * *             * * *
// * * * *         * * * *
// * * * * *     * * * * *
// * * * * * * * * * * * *
// * * * * *     * * * * *
// * * * *         * * * *
// * * *             * * *
// * *                 * *
// *                     *

public class $3ButterflyStar {

    private static void printStarPattern(int i, int n) {
        int j;
        // Loop for left wing
        for (j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        // Spaces
        for (j = 1; j <= 2 * (n - i); j++) {
            System.out.print("  ");
        }

        // Loop for left wing
        for (j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println("");
    }

    private static void printPattern(int n) {

        int i;

        for (i = 1; i <= n; i++) {
            printStarPattern(i, n);
        }

        for (i = n - 1; i >= 1; i--) {
            printStarPattern(i, n);
        }

    }

    public static void main(String[] args) {
        printPattern(6);
    }
}
