// ******
// *****
// ****
// ***
// **
// *
// **
// ***
// ****
// *****
// ******

public class $11KPattern {

    private static void printStarPattern(int i, int n) {
        int j;
        for (j = 1; j <= n - i; j++) {
            System.out.print("* ");

        }
        System.out.println("");
    }

    private static void printPattern(int n) {

        int i;

        for (i = 1; i < n - 1; i++) {
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
