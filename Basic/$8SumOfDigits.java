public class $8SumOfDigits {

    private static long result(long number) {
        long output = 0;
        while (number > 0) {
            output += number % 10;
            number = number / 10;
        }
        return output;
    }

    public static void main(String[] args) {
        System.err.println(result(1234));
    }

}
