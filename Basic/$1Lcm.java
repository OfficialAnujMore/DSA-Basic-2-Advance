public class $1Lcm {

    private static int result(int a, int b) {

        int ans = (a > b ? a : b);

        while (true) {

            if (ans % a == 0 && ans % b == 0) {
                break;
            }
            ans++;
        }

        return ans;

    }

    public static void main(String[] args) {
        int a = 15, b = 25;

        System.out.println("Result " + result(a, b));
    }

}
