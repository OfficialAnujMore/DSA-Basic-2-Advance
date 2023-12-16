//      *
//     * *
//    *   *
//   *     *
//  *       *
// *         *
//  *       *
//   *     *
//    *   *
//     * *
//      *

public class $15HollowDiamond {

    private static void printStarPattern(int i, int n) {
        int j;

        for (j = 1; j <= n - i; j++) {
            System.out.print(" ");

        }
        for (j = 1; j <= i; j++) {
            System.out.print(j == 1 | j == i ? "* " : "  ");
        }
        System.out.println("");
    }

    private static void printPattern(int n) {

        int i;

        for (i = 1; i <= n; i++) {
            printStarPattern(i, n);
        }

        for (i = n; i >= 1; i--) {
            printStarPattern(i, n);

        }
    }

    public static void main(String[] args) {
        printPattern(6);

    }
}
