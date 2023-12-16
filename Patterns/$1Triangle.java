/**
 * Star pattern
 * 
 * *
 * * *
 * * * *
 * * * * *
 */

class $1Triangle {

    public void result(int patternCount) {
        for (int i = 0; i < patternCount; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        $1Triangle st1 = new $1Triangle();
        st1.result(5);
    }
}