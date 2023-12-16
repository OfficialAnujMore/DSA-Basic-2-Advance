// Star Hollow
// total_ele_in_each_row  = (n * 2) -1
// n = 5
// * * * * * 
// *       *  9 = 10 -1
// *       *
// *       *
// * * * * *

// N = 6
// * * * * * *
// *         *
// *         *
// *         *
// *         *
// * * * * * *

public class $4SquareHollow {

    static void printEle(int ele) {

        for (int i = 0; i <= ele; i++) {
            for (int j = 0; j <= ele; j++) {
                if ((i == 0 || i == ele) || (j == 0 || j == ele)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");

        }

    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {

            printEle(i);
            System.out.println("");
        }
    }

}
