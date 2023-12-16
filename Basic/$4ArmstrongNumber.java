public class $4ArmstrongNumber {

    static boolean result(int value) {

        int lenOfValue = 0;
        int copyOfValue = value;
        while (copyOfValue != 0) {
            copyOfValue /= 10;
            lenOfValue += 1;
        }

        int sum_power = 0;

        copyOfValue = value;

        while (copyOfValue != 0) {
            int nthEle = copyOfValue % 10;
            sum_power += Math.pow(nthEle, lenOfValue);
            copyOfValue /= 10;

        }

        System.out.println(sum_power);

        return true;
    }

    public static void main(String[] args) {
        System.out.println(result(370));
    }

}
