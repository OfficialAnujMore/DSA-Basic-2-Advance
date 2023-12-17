public class $6Factorial {

    private static long result(int value) {
        long ans = 1;
        if (value == 0) {
            return 1;
        }
        ans = ans * value;
        return ans * result(value - 1);
    }

    public static void main(String[] args) {
        for (int i = 6; i <= 20; i++) {
            System.out.println("Factorial of " + i + "  " + result(i));
        }
    }

}
