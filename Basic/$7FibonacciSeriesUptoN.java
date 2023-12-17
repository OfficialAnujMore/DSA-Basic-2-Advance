
public class $7FibonacciSeriesUptoN {

    private static int result(int count) {
        if (count == 0)
            return 0;
        if (count == 1 || count == 2)
            return 1;
        // System.out.println("count==>" + " " + count + " " + (count - 1) + " " +
        // (count - 2) + " countopopp==>"
        // + result(count - 1) + result(count - 2));
        return result(count - 1) + result(count - 2);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            System.out.print(result(i) + " ");

        }

    }

}
