// *           *
// **         **
// ***       ***
// ****     ****
// *****   *****
// ****** ******
// *****   *****
// ****     ****
// ***       ***
// **         **
// *           *

public class $3ButterflyStar {

    static void printPattern(int i) {
        for (int j = 0; j < i + 1; j++) {
            System.out.print("*");
        }
    }

    static void output(int i, int patternCount) {
        int spaceCount = (((patternCount * 2) - 1) - (i * 2));
        printPattern(i);
        for (int j = 0; j < spaceCount; j++) {
            System.out.print(" ");
        }
        printPattern(i);
        System.out.println("");
    }

    static void result(int patternCount) {
        for (int i = 0; i < patternCount -1 ; i++) {
            output(i, patternCount);
        }
        for (int i = patternCount -1; i >= 0; i--) {
            output(i, patternCount);
        }
    }
    public static void main(String[] args) {
        result(6);
    }
}


