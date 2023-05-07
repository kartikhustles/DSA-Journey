import java.util.*;

public class Recursion1 {
    // public static void printNumb(int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n-1);
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     printNumb(n);
    // }



    // public static void printSum(int i, int n, int sum) {
    //     if (i == n) {
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i+1, n, sum);
    //     // System.out.println(i);
    // }
    // public static void main(String[] args) {
    //     printSum(1, 5, 0);
    // }



    // public static void Factorial(int i, int n, int fact) {
    //     if (i == n) {
    //         fact *= i;
    //         System.out.println(fact);
    //         return;
    //     }
    //     fact *= i;
    //     Factorial(i+1, n, fact);
    //     System.out.println(i);
    // }
    // public static void main(String[] args) {
    //     Factorial(1, 5, 1);
    // }


    // public static int calcFactorial(int n) {
    //     if (n == 1 || n == 0) {
    //         return 1;
    //     }
    //     int fact_nm1 = calcFactorial(n-1);
    //     int fact_n = n * fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String[] args) {
    //     int n = 5;
    //     int ans = calcFactorial(n);
    //     System.out.println(ans);
    // }



    // public static void printFib(int a, int b, int n) {
    //     if (n == 0) {
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.println(c);
    //     printFib(b, c, n-1);
    // }
    // public static void main(String[] args) {
    //     int a = 0, b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n = 7;
    //     printFib(a, b, n-2);
    // }



    // public static void main(String[] args) {
    //     int x = 2, n = 5;
    //     int ans = calcPower(x, n);
    //     System.out.println(ans);
    // }
    // public static int calcPower(int x, int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     if (x == 0) {
    //         return 0;
    //     }
    //     int Pownm1 = calcPower(x, n-1);
    //     int xPown = x * Pownm1;
    //     return xPown;
    // }


//     public static int calcPower(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         if (x == 0) {
//             return 0;
//         }
//         // if n is even
//         if (n % 2 == 0) {
//             return calcPower(x, n/2) * calcPower(x, n/2);
//         }
//         // if n is odd
//         else {
//             return calcPower(x, n/2) * calcPower(x, n/2) * x;
//         }
//     }
//     public static void main(String[] args) {
//         int x = 2, n = 5;
//         int ans = calcPower(x, n);
//         System.out.println(ans);
//     }
}