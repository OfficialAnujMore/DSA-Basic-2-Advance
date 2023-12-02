//           1 
//         2 1 2 
//       3 2 1 2 3 
//     4 3 2 1 2 3 4 
//   5 4 3 2 1 2 3 4 5 
// 6 5 4 3 2 1 2 3 4 5 6 (21)

public class $8PalindromeTriangle {

    public static void printPattern1(int ele) {

        for (int i = 1; i < ele; i++) {

            for (int j = 6; j > 0; j--) {
                System.out.print(j <= i ? j + " " : "  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println("");

        }

    }

    // GFG solution
    public static void printPattern2(int ele) {
        int i, j;

        // outer loop to handle number of rows
        for (i = 1; i <= ele; i++) {
            // inner loop to print the spaces
            for (j = 1; j <= 2 * (ele - i); j++) {
                System.out.print(" ");
            }

            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern1(7);
        printPattern2(7);

    }

}
