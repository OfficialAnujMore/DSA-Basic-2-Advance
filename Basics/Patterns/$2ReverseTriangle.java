/**
 * Star pattern
 * 
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 */
class $2ReverseTriangle {

    public static void printResult(int i) {
        for (int j = 0; j < i + 1; j++) {
            System.out.print("* ");
        }
        System.out.print("\n");
    }

    public void result(int patternCount) {
        
        for (int i = 0; i < patternCount; i++) {
            printResult(i);
        }
        for (int i = patternCount; i >= 0; i--) {
            printResult(i);
        }

    }

    public static void main(String[] args) {
        $2ReverseTriangle st2 = new $2ReverseTriangle();
        st2.result(5);
    }
}