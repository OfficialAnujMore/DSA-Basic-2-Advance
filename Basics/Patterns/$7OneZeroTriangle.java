// 1 
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1
// 1 0 1 0 1 0 1

public class $7OneZeroTriangle {
    public static void printPattern(int ele) {

        for (int i = 1; i < ele; i++) {
            int x = i % 2;
            for (int j = 1; j < i; j++) {
                x = x == 0 ? ++x : --x;
                System.out.print(x + " ");

            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        printPattern(9);
    }

}
// System.out.print("j===>" + j % 2 == 0 ? 1 : 0);
// System.out.print("j===>" + j % 2 == 0 ? 1 : 0);
// System.out.print(j % i+1 == 0 ? 'a' : 'b' + " ");
