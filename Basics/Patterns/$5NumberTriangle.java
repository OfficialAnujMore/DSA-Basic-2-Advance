/**
 * $5NumberTriangle
 */


//      1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 
// 6 6 6 6 6 6 

public class $5NumberTriangle {

    public static void printPattern(int ele) {
        for (int i = 0; i < ele; i++) {
            
            for (int j = 0; j < ele - (i + 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print(i+1+" ");
                
            }
            System.out.println("");

        }
    }

    public static void main(String[] args) {
        for (int i = 2; i <10; i++) {
            printPattern(i);
            
        }
    }

}
   