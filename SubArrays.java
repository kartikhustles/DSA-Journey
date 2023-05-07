import java.util.*;;

public class SubArrays {
    // // Print all SubArrays

    // public static void printSubarrays(int number[]){
    //     int tsa = 0;
    //     for (int i = 0; i < number.length; i++) {
    //         int start = i;
    //         for (int j = 0; j < number.length; j++) {
    //             int end = j;
    //             for (int k = start; k <= end; k++) {
    //                 System.out.print(number[k]+ " ");
    //             }
    //             tsa++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }

    //     System.out.println("total subarrays " +tsa);
    // }
    // public static void main(String[] args) {
    //     int[] numbers = {2, 4, 6, 8, 10};
    //     printSubarrays(numbers);
    // }





    // // Print the max sum of SubArrays(Brute Force)

    // public static void printSubarrays(int number[]){
    //     int ts = 0;
    //     int maxsum = 0;
    //     for (int i = 0; i < number.length; i++) {
    //         int start = i;
    //         for (int j = 0; j < number.length; j++) {
    //             int end = j;
    //             int temp = 0;
    //             for (int k = start; k <= end; k++) {
    //                 temp += number[k];
    //                 if (temp > maxsum) {
    //                     maxsum = temp;
    //                 }
    //             }
    //         }
    //     }

    //     System.out.println("max sum of subarrays " +maxsum);
    // }
    // public static void main(String[] args) {
    //     // int[] numbers = {2, 4, 6, 8, 10};
    //     int[] numbers = {2, 4, -6, -8, -10};
    //     printSubarrays(numbers);
    // }





    // // Print the max sum of Prefix SubArrays(Prefix Sum)

    // public static void printSubarrays(int number[]){
    //     int ts = 0;
    //     int maxsum = Integer.MIN_VALUE;
    //     int prefix[] = new int[number.length];
    //     prefix[0] = number[0];

    //     // Calculate prefix array
    //     for (int i = 1; i < prefix.length; i++) {
    //         prefix[i] = prefix[i-1] + number[i];
    //     }


    //     for (int i = 0; i < number.length; i++) {
    //         int start = i;
    //         for (int j = 0; j < number.length; j++) {
    //             int end = j;

    //             int temp = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

    //             if (temp > maxsum) {
    //                 maxsum = temp;
    //             }
    //         }
    //     }

    //     System.out.println("max sum of prefix subarrays " +maxsum);
    // }
    // public static void main(String[] args) {
    //     int[] numbers = {1, -2, 6, -1, 3};
    //     printSubarrays(numbers);
    // }







    // Print the max sum of Prefix SubArrays(Kadane's Algorithm)

    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        if (ms == 0) {
            int nms = Integer.MIN_VALUE; 
            for (int i = 0; i < number.length; i++) {
                if (nms < number[i]) {
                    nms = number[i];
                }
            }
            ms = nms;
        }
        System.out.println("Our max subarrays sum is : " +ms);
    }
    public static void main(String[] args) {
        // int[] numbers = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] numbers = {-2, -3, -4, -1, -2, -1, -5, -3};
        kadanes(numbers);
    }




}