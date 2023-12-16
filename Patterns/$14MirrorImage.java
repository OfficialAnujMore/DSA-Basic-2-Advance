// 1 2 3 4
//  1 2 3 
//   1 2 
//    1
//   1 2 
//  1 2 3 
// 1 2 3 4

class $14MirrorImage {

    private static void printStarPattern(int i, int n) {
        int j;
        for (j = 1; j <= i - 1; j++) {
            System.out.print(" ");
        }
        for (j = 1; j <= (n - i) + 1; j++) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }

    private static void printPattern(int n) {
        int i;

        for (i = 1; i <= n; i++) {
            printStarPattern(i, n);
        }

        for (i = n - 1; i > 0; i--) {
            printStarPattern(i, n);
        }

    }

    public static void main(String[] args) {
        printPattern(4);

    }
}