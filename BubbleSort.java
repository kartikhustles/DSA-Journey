import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort{
//     public static void main(String[] args) {
//         int[] arr = {-3, -6, -9, 45, 0};
//         insertion(arr);
//         System.out.println(Arrays.toString(arr));
//     }

//     public static void insertion(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             int temp = arr[i];
//             int j = i-1;
//             while (j>=0 && arr[j]>temp) {
//                 arr[j+1] = arr[j];
//                 j--;
//             }
//             arr[j+1] = temp;
//         }
//     }





    
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with the correct index
            int end = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, end);
            swap(arr, maxIndex, end);
        }
    }

    public static int getMaxIndex(int[] arr, int start, int last){
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] <  arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }






//     public static void bubble(int[] arr) {
//         boolean swapped;
//         // run the loop till n-1 times
//         for (int i = 0; i < arr.length; i++) {
//             swapped = false;
//             // for each step, max item will come at the last respective index
//             for (int j = 1; j < arr.length - i; j++) {
//                 // swap if the item is smaller than the previous item
//                 if (arr[j] < arr[j-1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j-1];
//                     arr[j-1] = temp;
//                     swapped = true;
//                 }
//             }
//             if (swapped == false) {
//                 break;
//             }
//         }
//     }





//     public static void main(String[] args) {
//         int[] arr = {-3, -6, -9, 45, 0};
//         quickSort(arr, 0, 4);
//         System.out.println(Arrays.toString(arr));
//     }


//     public static void quickSort(int[] arr, int l, int h) {
//         if (l < h) {
//             int Pindex = Partition(arr, l, h);
//             quickSort(arr, l, Pindex-1);
//             quickSort(arr, Pindex+1, h);
//         }
//     }

//     public static int Partition(int[]arr , int l, int h) {
//         int pivot = arr[l];
//         int i = l;
//         int j = h;
//         while (i<j) {
//             while (arr[i] <= pivot) {
//                 i++;
//             }
//             while (arr[j] > pivot) {
//                 j--;
//             }
//             if (i < j) {
//                 swap(arr, i, j);
//             }
//         }
//         swap(arr, j, l);
//         return j;
//     }

//     public static void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }



//     public static void countSort(int[] arr, int min, int max) {
//         int range = max - min + 1;
//         int[] farr = new int[range];

//         for(int i = 0; i < arr.length; i++){
//             int idx = arr[i] - min;
//             farr[idx]++;
//         }

//         for(int i = 1; i < farr.length; i++){
//             farr[i] = farr[i] + farr[i-1];
//         }

//         int[] ans = new int[arr.length];

//         for (int i = arr.length - 1; i >= 0; i--) {
//             int val = arr[i];
//             int pos = farr[val - min];
//             int idx = pos - 1;
//             ans[idx] = val;
//         }
//     }

//     public static void print(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void main(String[] args) throws Exception{
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//             max = Math.max(max, arr[i]);
//             min = Math.max(min, arr[i]);
//         }
//         countSort(arr, min, max);
//         print(arr);
//     }
}