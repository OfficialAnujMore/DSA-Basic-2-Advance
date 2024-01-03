package Recurssion;

public class $3DecimalToBinary {

    private String result(int num) {
        if (num == 0) {
            return "";
        }

        return result(num / 2) + num % 2;
    }

    public static void main(String[] args) {
        $3DecimalToBinary obj = new $3DecimalToBinary();
        int num = 233;

        System.out.format("Result of %d is %s  ", num, obj.result(num));
    }

}
