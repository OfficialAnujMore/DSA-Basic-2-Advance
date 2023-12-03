//     * * * * * 
//    * * * * * 
//   * * * * * 
//  * * * * * 
// * * * * *

public class $9Rhombus {

    private static void printPattern(int ele) {

        for (int i = 0; i < ele; i++) {
            // Loop to print the initial spaces

            for (int j = 0; j < ele - i - 1; j++) {
                System.out.print(" ");
            }
            // Loop to print stars
            for (int j = 0; j < ele; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        printPattern(10);
    }

}