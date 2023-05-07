import java.util.ArrayList;

public class recursionArray {

    // // Issorted
    // public static void main(String[] args) {
    // int[] arr = { 7, 2, 4, 8, 9, 10 };
    // int[] arr1 = { 1, 2, 4, 8, 9, 10, 15 };
    // System.out.println(isSorted(arr, 0));
    // System.out.println(isSorted(arr1, 0));
    // }

    // static boolean isSorted(int[] arr, int i) {
    // if (i == arr.length - 1) {
    // return true;
    // } else if (arr[i] > arr[i + 1]) {
    // return false;
    // } else {
    // return isSorted(arr, i + 1);
    // }
    // }

    // searching
    // public static void main(String[] args) {
    // int[] arr = { 12, 5, 99, 100, 120 };
    // System.out.println(search(arr, 120, 0));
    // }

    // static int search(int[] arr, int target, int index) {
    // if (index == arr.length) {
    // return -1;
    // } else if (arr[index] == target) {
    // return index;
    // } else {
    // return search(arr, target, index + 1);
    // }
    // }

    // // Return indexes of target element in an array main
    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 4, 8 };
    // System.out.println(Index(arr, 4, 0));
    // }

    // static ArrayList<Integer> ans = new ArrayList<>();

    // static ArrayList<Integer> Index(int[] arr, int target, int index) {
    // if (index == arr.length) {
    // return ans;
    // } else if (arr[index] == target) {
    // ans.add(index);
    // }
    // return Index(arr, target, index + 1);
    // }

    // // Return indexes of target element in an array another method
    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3, 4, 4, 8 };
    // System.out.println(Index(arr, 4, 0));
    // }

    // static ArrayList<Integer> Index(int[] arr, int target, int index) {
    // ArrayList<Integer> ans = new ArrayList<>();
    // if (index == arr.length) {
    // return ans;
    // } else if (arr[index] == target) {
    // ans.add(index);
    // }
    // ArrayList<Integer> key = Index(arr, target, index + 1);
    // ans.addAll(key);
    // return ans;
    // }
}