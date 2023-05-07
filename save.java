import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class save {
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();

    //     int numbers[] = new int[size];

    //     for(int i = 0; i < size; i++){
    //         numbers[i] = sc.nextInt();
    //     }

    //     int max = Integer.MIN_VALUE;
    //     int min = Integer.MAX_VALUE;

    //     for(int i=0; i<numbers.length; i++) {
    //         if(numbers[i] < min) {
    //             min = numbers[i];
    //         }
    //         if(numbers[i] > max) {
    //             max = numbers[i];
    //         }
    //     }
    //     System.out.println(min);
    //     System.out.println(max);
    // }



    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];

    //     //input
    //     for(int i=0; i<size; i++) {
    //         numbers[i] = sc.nextInt();
    //     }

    //     boolean isAscending = true;
    //     for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
    //         if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
    //             isAscending = false;
    //         }
    //     }

    //     if(isAscending) {
    //         System.out.println("The array is sorted in ascending order");
    //     } else {
    //         System.out.println("The array is not sorted in ascending order");
    //     }
    // }



    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int year = sc.nextInt();
    //     int leap = 0;

    //     if(year % 4 == 0){
    //         if(year % 100 == 0){
    //             if(year % 400 == 0){
    //                 leap = 1;
    //             }
    //             else{
    //                 leap = 0;
    //             }
    //         }
    //         else{
    //             leap = 1;
    //         }
    //     }
    //     else{
    //         leap = 0;
    //     }

    //     if(leap == 0){
    //         System.out.println(year+ " is not a leap year !");
    //     }
    //     else if(leap == 1){
    //         System.out.println(year+ " is a leap year !");
    //     }
    // }



    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n1 = sc.nextInt();
    //     int n2 = sc.nextInt();
    //     int hcf=0;
    //     for(int i = 1; i <= n1 && i <= n2; i++) {
    //         if( n1%i == 0 && n2%i == 0 ){
    //             hcf = i;
    //         }
    //     }
    //     System.out.println("HCF of given two numbers is "+hcf);
    //     int lcm = (n1*n2)/hcf;
    //     System.out.println("LCM of given two numbers is "+lcm);
    // }


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("p r t");
    //     float p = sc.nextFloat();
    //     int r = sc.nextInt();
    //     int t = sc.nextInt();
    //     float si = 0;

    //     si = (p*r*t)/100;

    //     System.out.println(si);
    // }


    // public static void main(String[] args) {
        
    //     // Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    
    //     Scanner sc = new Scanner(System.in);
    
    //     int i = 0;
    //     int ans = 0;
        
    //     while (true) {
    //         System.out.print("Enter Number : ");
    //         int num = sc.nextInt();
    //         if(num > 0){
    //             ans = ans + num;
    //         }
    //         else if(num == 0){
    //             break;
    //         }
    //         else{
    //             System.out.println("Enter a +ve Number");
    //         }
    //         i++;
    //     }
    //     System.out.println("Sum is " +ans);
    // }



    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int i = 0;
    //     int largest = 0;
    //     int n;

    //     while (true) {
    //         System.out.print("Enter Number : ");
    //         n = sc.nextInt();

    //         if (n != 0) {
    //             if (n > largest) {
    //                 largest = n;
    //             }
    //         }
    //         else{
    //             break;
    //         }
    //         i++;    
    //     }
    //     System.out.println("Largest is : " +largest);
    // }



    // public static void main(String[] args) {

    //     // Calculate Depreciation of Value

    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter v1, r and t respectively : ");
    //     int v = sc.nextInt();
    //     float r = sc.nextInt();
    //     int t = sc.nextInt();
    //     float m = 1;

    //     for (int i = 1; i <= t; i++) {
    //         m = m * (1-r/100);
    //     }
    //     // System.out.println(m);
    //     float value = v * m;
    //     System.out.println(value);
    // }



    // public static void main(String[] args) {

    //     //Permutation & Combination Formulae

    //     Scanner sc = new Scanner(System.in);

    //     System.out.print("Enter n and r respectively : ");

    //     int n = sc.nextInt();
    //     int r = sc.nextInt();
    //     long nf = 1;
    //     long nrf = 1;
    //     long rf = 1;
    //     double com;
    //     double per;

    //     // n factorial

    //     for (int i = 1; i <= n; i++) {
    //         nf = nf * i;
    //     }

    //     // (n-r) factorial

    //     for (int i = 1; i <= n-r; i++) {
    //         nrf = nrf * i;
    //     }
        
    //     // r factorial

    //     for (int i = 1; i <= r; i++) {
    //         rf = rf * i;
    //     }

    //     com = nf/(nrf*rf); 
    //     per = nf/nrf; 

    //     System.out.println("Combination is : " +com);
    //     System.out.println("Permutation is : " +per);
    // }


    // public static void main(String[] args) {
    //     // Find if a number is palindrome or not
        
    //     Scanner sc = new Scanner(System.in);
        
    //     System.out.print("Enter a Number : ");
        
    //     int n = sc.nextInt();
    //     int rev = 0;

    //     for (int i = 0; n > 0; i++) {
    //         int rem = n % 10;
    //         n = n / 10;
    //         rev = (rev)*10 + rem;
    //         // System.out.println(rev);
    //     }
    //     System.out.println(rev);
    // }



    // public static void main(String[] args) {
    //     // Kunal is allowed to go out with his friends only on the even days of a given month. 
    //     // Write a program to count the number of days he can go out in the month of August.


	// 	Scanner sc = new Scanner(System.in);
		
	// 	System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
	// 	int month = sc.nextInt();
    //     int days = 0;
		
	// 	if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 )
	// 	{
    //         days = 31;
	// 		System.out.println("31 Days in this Month");  	
	// 	}
	// 	else if ( month == 4 || month == 6 || month == 9 || month == 11 )
	// 	{
    //         days = 30;
	// 		System.out.println("30 Days in this Month");  	
	// 	}  
	// 	else if ( month == 2 )
	// 	{
    //         days = 28;
	// 		System.out.println("Either 28 or 29 Days in this Month");  	
	// 	} 
	// 	else{
	// 		System.out.println("Please enter Valid Number between 1 to 12");
	//     }
    //     int all = days/2;
    //     System.out.println("Allowed Days are : " +all);
    // }


    // public static void main(String[] args) {
    //     // Write a program to print the sum of negative numbers, sum of positive even numbers and 
    //     // the sum of positive odd numbers from a list of numbers (N) entered by the user. The list 
    //     // terminates when the user enters a zero.
        
    //     Scanner sc = new Scanner(System.in);

    //     int i = 0;
    //     int negative = 0;
    //     int even = 0;
    //     int odd = 0;
        
    //     while (true) {
    //         int n = sc.nextInt();
    //         if (n < 0) {
    //             negative++;
    //         }
    //         else if(n > 0){
    //             if (n % 2 == 0) {
    //                 even++;
    //             }
    //             else{
    //                 odd++;
    //             }
    //         }
    //         else{
    //             break;
    //         }
    //         i++;
    //     }
    //     System.out.println("Negative : " +negative);
    //     System.out.println("Odd : " +odd);
    //     System.out.println("Even : " +even);
    // }



        // public static void main(String[] args) {
    //     // Define a method to find out if a number is prime or not.
        
    //     System.out.print("Enter a Number : ");
    //     Scanner sc = new Scanner(System.in);
        
    //     while(true){
    //         int n = sc.nextInt();
    //         isPrime(n);
    //     }  

    // }
    // static void isPrime(int n){    
    //     int count = 0;
    
    //     for (int i = 2; i*i <= n; i++) {
    //         if(n % i == 0){
    //                 count++;
    //                 break;
    //         }
    //     }
    //     if (count == 0) {
    //         System.out.println("Prime Number");
    //     }
    //     else{
    //         System.out.println("Not a Prime Number");
    //     }
    // } 



    // // Write a function that returns all prime numbers between two given numbers.

    // public static void main(String[] args) {
    //     System.out.println("Enter the Range of Numbers : ");
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     rangePrime(a, b);
    // }

    // static void rangePrime(int a, int b){
    //     for (int i = a; i <= b; i++) {
    //         int c = 0;
    //         for (int j = 2; j*j <= i; j++) {
    //             if (i%j == 0) {
    //                 c++;
    //             }
    //         }
    //         if (c == 0) {
    //             System.out.println(i+ " is Prime");
    //         }
    //     }
    // }



    // Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet
    // is when the sum of the square of two numbers is equal to the square of the third number).

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int x = sc.nextInt();
    //     int y = sc.nextInt();
    //     int z = sc.nextInt();

    //     Pytha(x, y, z);

    // }
    // static void Pytha(int a, int b, int c){
    //     if((a*a) + (b*b) == (c*c)){
    //         System.out.println("Pythagorean Triplet");
    //     }
    //     else{
    //         System.out.println("Not a Pythagorean Triplet");
    //     }
    // }    
}






// import java.util.*;
// import java.util.Arrays;
// import java.util.Scanner;
// import java.util.ArrayList;
// import java.lang.Math;

// public class check {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int n = sc.nextInt();

//         if (0 <= a && 50 >= a && 0 <= b && 50 >= b && 1 <= n && 15 >= n) {
//             double ans = a + (1*b);
//             System.out.print((int)ans+ " ");
            
//             for(int i = 1; i < n; i++){
//                 ans = ans+b*(Math.pow(2,i));
//                 System.out.print((int)ans+ " ");
//             }
//         }
//         else{
//             System.out.println();
//         }
//     }
// }