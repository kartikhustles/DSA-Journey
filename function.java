import java.lang.reflect.Array;
import java.security.spec.PSSParameterSpec;
import java.util.*;
import java.util.Arrays;
import javax.print.DocFlavor.STRING;
import javax.swing.text.html.StyleSheet;

public class function {
    // public static int calculatePro(int a, int b){
    //     int Pro = a * b;
    //     return Pro;
    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int x = sc.nextInt();
    //     int y = sc.nextInt();

    //     int Final = calculatePro(x, y);
    //     System.out.println(Final);
    // }



    // public static void main(String args[]) {
    //     int ans = sum();
    //     System.out.println(ans);
    // }
    // static int sum() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Number 1 : ");
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter Number 2 : ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2;
    //     return sum;
    // }



    // public static void main(String args[]) {
    //     sum();
    // }
    // static void sum() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Number 1 : ");
    //     int num1 = sc.nextInt();
    //     System.out.print("Enter Number 2 : ");
    //     int num2 = sc.nextInt();
    //     int sum = num1 + num2;
    //     System.out.println(sum);
    // }


    // public static void main(String[] args) {
    //     String greet = message();
    //     System.out.println(greet);
    // }
    // static String message() {
    //     System.out.println("Say a Message!");
    //     Scanner sc = new Scanner(System.in);
    //     String greeting = sc.nextLine();
    //     return greeting;
    // }



    // public static void main(String[] args) {
    //     int ans = sum(20, 30);
    //     System.out.println(ans);
    // }
    // static int sum(int a, int b){
    //     int sum = a + b;
    //     return sum;
    // }



    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter Your Name : ");
    //     String name = sc.nextLine();
    //     String personalised = myGreet(name);
    //     System.out.println(personalised);
    // }
    // static String myGreet(String naam){
    //     String message = "Hello " + naam + " !";
    //     return message;
    // }


    // Important

    public static void main(String[] args) { 
        int a = 10;
        int b = 20;
        
        swap(a, b);
        System.out.println(a+ " " +b);

        String name = "Kartik Agarwal";
        changeName(name);
        System.out.println(name);
    }    
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static void changeName(String name){
        name = "Rahul Rana";
    }

//     public static void main(String[] args) { 
//         int a = 10;
//         int b = 20;
        
//         swap(a, b);
//     String name = "Kartik Agarwal";
//     changeName(name);
// }    
// static void swap(int a, int b){
//     int temp = a;
//     a = b;
//     b = temp;
//     System.out.println(a+ " " +b);
// }
// static void changeName(String name){
//     name = "Rahul Rana";
//     System.out.println(name);
//     }


    // public static void main(String[] args) {
    //     int[] arr = {1, 3, 2, 45, 6};
    //     change(arr);
    //     System.out.println(Arrays.toString(arr));
    // }
    // static void change(int[] nums){
    //     nums[0] = 99; 
    //     nums[3] = 200;
    // }

    // static int x = 90;
    // public static void main(String[] args) {
    //     System.out.println(x);
    //     int x = 40;
    //     System.out.println(x);
    //     fun();
    // }
    // static void fun(){
    //     System.out.println(x);
    // }



    // public static void main(String[] args) {
    //     fun(1,2,3,4,5);
    //     multiple(2 ,3 ,"Kartik" ,"Yash");
    //     emp();
    // }
    // static void fun(int...v){
    //     System.out.println(Arrays.toString(v));
    // }
    // static void multiple(int a, int b, String...v){
    //     System.out.println(Arrays.toString(v));
    // }
    // static void emp(int ...z){
    //     System.out.println(Arrays.toString(z));
    // }


    // public static void main(String[] args) {
    //     fun1(69);
    //     fun2("ChummiLele");
    // }
    // static void fun1(int a){
    //     System.out.println(a);
    // }
    // static void fun2(String a){
    //     System.out.println(a);
    // }


    // public static void main(String[] args) {
    //     // int ans = sum(1, 2);
    //     int ans = sum(1, 2, 3);
    //     System.out.println(ans);
    // }

    // static int sum(int a, int b){
    //     return a + b;
    // }
    // static int sum(int a, int b, int c){
    //     return a + b + c;
    // }



//Error



    // public static void main(String[] args) {
    //     int ans = sum();
    //     System.out.println(ans);
    // }

    // static int sum(int a, int b){
    //     return a + b;
    // }
    // static int sum(int a, int b, int c){
    //     return a + b + c;
    // }



    // public static void main(String[] args) {
    //     demo(6,7,8);
    //     demo("Kartik","Yash","Shanu");
    // }
    // static void demo(int...v){
    //     System.out.println(Arrays.toString(v));
    // }
    // static void demo(String...v){
    //     System.out.println(Arrays.toString(v));
    // }



    // public static void main(String[] args) {
    //     // Scanner sc = new Scanner(System.in);
    //     // int n = sc.nextInt();
    //     for (int i = 1; i < 1000; i++) {
    //         if(isArmstrong(i)){
    //             System.out.print(i + " ");
    //         }
    //     }
    // }

    // static boolean isArmstrong (int n) {
    //     int original = n;
    //     int sum = 0;
    //     while (n > 0) {
    //     int rem = n % 10;
    //     n = n/ 10;
    //     sum = sum + rem*rem*rem;
    //     }
    //     return sum == original;
    // }        



    // public static void main(String[] args){
    //     System.out.print("Enter a Number : ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     isPrime(n);
    // }

    // static void isPrime(int n){
    //     int c = 0;
    //     for (int i = 2; i*i <= n; i++) {
    //         if(n%i == 0){
    //             c++;
    //         }
    //     }
    //     if(c == 0){
    //         System.out.println(n+ " is Prime !");
    //     }
    //     else{
    //         System.out.println(n+ " Not Prime !");
    //     }
    // }


    // public static void main(String[] args){
    //     System.out.print("Enter a Number : ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     boolean ans = isPrime(n);
    //     System.out.println(ans);
    // }

    // static boolean isPrime(int n) {
    //     if (n <= 1) {
    //         return false;
    //     }
    //     int c = 2;
    //     while (c * c <= n) {
    //         if (n % c == 0) {
    //             return false;
    //         }
    //         c++;
    //     }
    //     if(c * c > n){
    //         return true;
    //     }
    //     return false;
    // }



    // public static void main(String[] args) {
    //     System.out.println("Enter the Range of Numbers : ");
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     rangePrime(a, b);
    // }

    // static void rangePrime(int a, int b){
    //     for (int i = a+1; i < b; i++) {
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


    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     addDigits(n);
    // }

    // static void addDigits(int num){
    //     int ans = 0;
    //     while (num % 10 != 0) {
    //         int first = num % 10;
    //         int second = num / 10;
    //         ans = ans + first;
    //         num = second;
    //     }
    //     System.out.println(ans);
    // }
}