import java.util.Scanner;

public class $10PercentCalculator {

    private void studentResult(float[] marks) {
        int sum = 0, total_marks = (marks.length * 100);
        for (float i : marks) {
            sum += i;

        }
        float result = ((sum * 100) / total_marks);
        System.out.println("Percent => " + result);
    }

    public static void main(String[] args) {

        float[] marks = new float[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of subject " + (i + 1));
            float mark = sc.nextFloat();
            marks[i] = mark;
        }
        sc.close();
        $10PercentCalculator res = new $10PercentCalculator();
        res.studentResult(marks);

    }

}
