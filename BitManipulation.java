import java.util.*;

public class BitManipulation {
    // public static void oddOrEven(int num) {
    //     int bitmask = 1;
    //     if ((bitmask & num) == 0) {
    //         System.out.println("Even Number !");
    //     }
    //     else{
    //         System.out.println("Odd Number !");
    //     }
    // }

    // public static void main(String[] args) {
    //     oddOrEven(3);
    //     oddOrEven(5);
    //     oddOrEven(9);
    //     oddOrEven(88);
    //     oddOrEven(70);
    // }




    // public static int ithBit(int n, int ith) {
    //     if (((1<<ith) & n) == 0) {
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }
    // public static void main(String[] args) {
    //     System.out.println(ithBit(15, 2));
    //     System.out.println(ithBit(10, 4));
    //     System.out.println(ithBit(1, 0));
    // }




    // public static int setithBit(int n, int ith) {
    //     return ((1<<ith) | n);
    // }
    // public static void main(String[] args) {
    //     System.out.println(setithBit(15, 4));
    //     System.out.println(setithBit(10, 2));
    //     System.out.println(setithBit(1, 0));
    // }



    // public static int setithBit(int n, int ith) {
    //     return (~(1<<ith) & n);
    // }
    // public static void main(String[] args) {
    //     System.out.println(setithBit(15, 4));
    //     System.out.println(setithBit(10, 1));
    //     System.out.println(setithBit(1, 0));
    // }


    // public static void updateBit(int n, int ith, int sorc) {
    //     if (sorc == 0) {
    //         System.out.println(~(1<<ith) & n);
    //     }
    //     else if (sorc == 1) {
    //         System.out.println((1<<ith) | n);
    //     }
    //     else{
    //         System.out.println("Invalid Info!");
    //     }
    // }
    // public static void main(String[] args) {
    //     updateBit(10, 2, 0);
    //     updateBit(16, 1, 1);
    //     updateBit(15, 3, 0);
    //     updateBit(15, 3, 3);
    // }



    // public static int clearLastIthBits(int n, int i) {
    //     int bitMask = (~0)<<i;
    //     return (n & bitMask);
    // }
    // public static void main(String[] args) {
    //     System.out.println(clearLastIthBits(15, 2));
    // }



    // public static int clearBitsInRange(int n, int i, int j) {
    //     int a = ((~0)<<(j+1));
    //     int b = (1<<i)-1;
    //     int bitMask = a | b;
    //     return n & bitMask;
    // }
    // public static void main(String[] args) {
    //     System.out.println(clearBitsInRange(10, 2, 4));
    // }






    // public static void powerOfTwo(int n) {
    //     if (((n-1) & n) == 0) {
    //         System.out.println("Yes!");
    //     }
    //     else{
    //         System.out.println("No!");
    //     }
    // }

    // public static void main(String[] args) {
    //     powerOfTwo(8);
    //     powerOfTwo(9);
    //     powerOfTwo(32);
    //     powerOfTwo(10);
    // }




    // public static int countSetBits(int n) {
    //     int count = 0;
    //     while (n > 0) {
    //         if ((n & 1) != 0) {
    //             count++;
    //         }
    //         n = n >> 1;
    //     }
    // return count;
    // }
    // public static void main(String[] args) {
    //     System.out.println(countSetBits(10));
    //     System.out.println(countSetBits(15));
    // }
}
