import java.net.Socket;
import java.util.Scanner;

public class important {
    public static void main(String[] args) {

        // System.out.println("Hello World !");

        //TypeCasting

        // System.out.println((int)(67.98f));
        
        // float a = 67.98f;
        // int num = (int)(a);
        // System.out.println(num);

        // int a = 257;
        // byte b = (byte)(a);  // 257 % 256 = 1
        // System.out.println(b);
    

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;
        
        // System.out.println(d);

        
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int a = 0;
        // int b = 1;
        // int count = 2;

        // while(count <= n){
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        //     count++;
        // }

        // System.out.println(b);


//Digits Count Problem in a Number


        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int count = 0;
        // while(n > 0){
        //     int rem = n % 10;
        //     if (rem == 5){
        //         count++;
        //     }
        //     n = n / 10;
        // }
        // System.out.println(count);


        // Printing Number in reverse Order
        
        
    //     Scanner in = new Scanner(System.in);
    //     int n = in.nextInt();
    //     rev(n);
    // }        

    // static void rev (int n) {
    //     int ans = 0;
    //     while(n > 0){
    //         int rem = n % 10;
    //         n = n / 10;
    //         ans = (ans)*10 + rem;
    //     }
    //     System.out.println(ans);
    // }



    // Switch Case


    // Scanner in = new Scanner(System.in);
    // String fruits = in.next();

    // switch(fruits){
    //     case "Mango":
    //         System.out.println("King of Fruits");
    //         break;
    //     case "Apple":
    //         System.out.println("A sweet red Fruit");
    //         break;
    //     case "Oranges":
    //         System.out.println("Round Fruit");
    //         break;
    //     case "Grapes":
    //         System.out.println("Small Fruit");
    //     default:
    //         System.out.println("Please enter a valid fruit");            
    // }

// Enhanced Switch Case

    // Scanner in = new Scanner(System.in);
    // String fruits = in.next();

    // switch(fruits){
    //     case "Mango" -> System.out.println("King of Fruits");
    //     case "Apple" -> System.out.println("A sweet red Fruit");
    //     case "Oranges" -> System.out.println("Round Fruit");
    //     case "Grapes" -> System.out.println("Small Fruit");
    //     default -> System.out.println("Please enter a valid fruit");
    // }


    // Scanner sc = new Scanner(System.in);
    // int day = sc.nextInt();

    // switch(day){
    //     case 1 -> System.out.println("Monday");
    //     case 2 -> System.out.println("Tuesday");
    //     case 3 -> System.out.println("Wednesday");
    //     case 4 -> System.out.println("Thursday");
    //     case 5 -> System.out.println("Friday");
    //     case 6 -> System.out.println("Saturday");
    //     case 7 -> System.out.println("Sunday");
    // }
    // switch(day){
    //     case 1:
    //     case 2:
    //     case 3:
    //     case 4:
    //     case 5:
    //         System.out.println("Weekdays");
    //         break;
    //     case 6:
    //     case 7:
    //         System.out.println("Weekends");
    //         break;
    // }


    // Nested Switch

    // Scanner sc = new Scanner(System.in);
    // int empID = sc.nextInt();
    // String department = sc.next();

    // switch (empID) {
    //     case 1:
    //         System.out.println("Kunal Kushwaha");
    //         break;
    //     case 2:
    //         System.out.println("Kartik Agarwal");
    //         break;
    //     case 3:
    //         switch (department) {
    //             case "IT":
    //                 System.out.println("IT Department");
    //                 break;
    //             case "Management":
    //                 System.out.println("Management Department");
    //                 break;
    //             default:
    //                 System.out.println("No Department Entered");    
    //         }    
    // }



    // Scanner in = new Scanner(System.in);
    // String fruits = in.next();

    // if(fruits.equals("Mango")){
    //     System.out.println("King of Fruits");
    // }
    // else if(fruits.equals("Apple")){
    //     System.out.println("A sweet red Fruit");
    // }


        // Maximum and Minimum Value

        // int a = 30;
        // int b = 20;
        // int c = 40;

        // int max = Math.max(c, Math.max(a, b));
        // int min = Math.min(c, Math.min(a, b));

        // System.out.println(max);
        // System.out.println(min);



        // check whether the no. is Upper Case or Lower Case


        // Scanner sc = new Scanner(System.in);
        // char ch = sc.next().trim().charAt(0);

        // if(ch >= 'a' && ch <= 'z'){
        //     System.out.println(ch+ " is Lowercase");
        // } else if(ch >= 'A' && ch <= 'Z'){
        //     System.out.println(ch+ " is Uppercase");
        // }


        // Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // StringBuilder sb = new StringBuilder(input);

        // for(int i = 0; i < sb.length()/2; i++) {
        //     int front = i;
        //     int back = sb.length() - 1 - i; // 5 - 1 - 0 => 4

        //     char frontChar = sb.charAt(front);
        //     char backChar = sb.charAt(back);

        //     sb.setCharAt(front, backChar);
        //     sb.setCharAt(back, frontChar);
        // }
        // System.out.println(sb);
    }
}

// & => Binary AND
// | => Binary OR
// ^ => Binary XOR     // Dono Different Hone Chaiyeh
// ~ => Binary Ones Complement // Opposite
// << => Binary Left Shift

// 0101 << 1 => 1010

// 0110 << 1 => 1100

// N << i
// 2 << 1
// 010 << 1 => 100

// >> => Binary Right Shift

// N >> i
// 2 >> 1
// 010 >> 1 => 001