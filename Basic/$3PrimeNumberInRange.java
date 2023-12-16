/*
 * 
 * Sieve of Eratosthenes
 *  https://www.geeksforgeeks.org/sieve-of-eratosthenes/
 * https://www.youtube.com/watch?v=dyrRM8dTEus
 * 
 */

import java.util.Arrays;

public class $3PrimeNumberInRange {

    static void result(int n) {
        /*
         * Initialize an empty array with from 1 to n+1
         * All the boolean values inside the array will have the default value of true
         */
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        /*
         * To check for a prime number we need to iterate upto i square
         * Also we need to increment the value of j by the value of i
         * Eg:= If i=2 j will be in increment value as 2 4 6 8 etc
         * 
         * In the inner loop all the values will be non prime numbers
         * 
         */
       
        for (int i = 2; i * i <= n; i++) {

            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        /*
         * Inside the boolean array if the value of the index is true than the number is prima
         */
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true)
                System.out.println(i + " isPrime");
        }

    }

    public static void main(String[] args) {
        result(200);
    }

}
