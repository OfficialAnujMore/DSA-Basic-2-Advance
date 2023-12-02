// 1       
// 2 3     
// 4 5 6   
// 7 8 9 10 

public class $6NumberChanging {

    public static void printPattern(int ele) {
        int x = 1;
        for (int i = 0; i <= ele; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(x + " ");
                x += 1;
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        printPattern(4);

    }
}
