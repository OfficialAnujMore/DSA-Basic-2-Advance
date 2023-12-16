public class $2Gcd {

    private static int result(int n1, int n2) {

        if (n2 != 0) {
            result(n2, n1 % n2);
        }
        return n1;
    }

    public static void main(String[] args) {
        int n1 = 366, n2 = 60;
        System.out.println("GCD is " + result(n1, n2));
    }

}
