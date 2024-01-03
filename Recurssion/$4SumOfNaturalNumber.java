package Recurssion;

public class $4SumOfNaturalNumber {
    private int result(int num) {
        if (num == 0) {
            return num;
        }

        return num + result(num - 1);
    }

    public static void main(String[] args) {
        $4SumOfNaturalNumber obj = new $4SumOfNaturalNumber();
        int num = 10;

        System.out.format("Result of %d is %s ", num, obj.result(num));
    }
}
