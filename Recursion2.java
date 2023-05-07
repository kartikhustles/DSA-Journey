import java.util.HashSet;

import javax.lang.model.element.Element;

public class Recursion2 {
    // public static void towerOfHanoi(int n, String src, String helper, String dest) {
    //     if (n == 1) {
    //         System.out.println("Transfer disk " +n+ " From " +src+ " To " +dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest, helper);
    //     System.out.println("Transfer disk " +n+ " From " +src+ " To " +dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    // public static void main(String[] args) {
    //     int n = 3;
    //     towerOfHanoi(n, "S", "H", "D");
    // }




    // public static void printRev(String str, int index) {
    //     if (index == 0) {
    //         System.out.print(str.charAt(index));
    //         return;
    //     }

    //     System.out.print(str.charAt(index));
    //     printRev(str, index-1);
    // }
    // public static void main(String[] args) {
    //     String str = "kartik";
    //     printRev(str, str.length()-1);
    // }



    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurance(String str, int idx, char element){
    //     if (idx == str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == element){
    //         if (first == -1) {
    //             first = idx;
    //         } else {
    //             last = idx;
    //         }
    //     }
    //     findOccurance(str, idx + 1, element);
    // }

    // public static void main(String[] args) {
    //     String str = "abaacdaefaah";
    //     findOccurance(str, 0, 'a');
    // }


    // public static boolean isSorted(int[] arr, int idx) {
    //     if (idx == arr.length - 1) {
    //         return true;
    //     }
    //     if (arr[idx] < arr[idx + 1]) {
    //         // array is sorted now
    //         return isSorted(arr, idx + 1);
    //     }
    //     else{
    //         return false;
    //     }
    // }
    // public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5};
    //     System.out.println(isSorted(arr, 0));
    // }



    // public static void moveAllX(String str, int idx, int count, String newString) {
    //     if (idx == str.length()) {
    //         for (int i = 0; i < count; i++) {
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if (currChar == 'x') {
    //         count++;
    //     }
    //     else{
    //         newString += currChar;
    //     }
    //     moveAllX(str, idx+1, count, newString);
    // }
    // public static void main(String[] args) {
    //     String str = "axbcxxd";
    //     moveAllX(str, 0, 0, "");
    // }





    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicates(String str, int idx, String newString) {
    //     if (idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }

    //     char currChar = str.charAt(idx);
    //     if (map[currChar - 'a'] == false) {
    //         newString += currChar;
    //         map[currChar - 'a'] = true;
    //     }
    //     removeDuplicates(str, idx+1, newString);
    // }

    // public static void main(String[] args) {
    //     String str = "abbccda";
    //     removeDuplicates(str, 0, "");
    // }



    // public static void Subsequence(String str, String NewString, int index){
    //     if (index == str.length()) {
    //         System.out.println(NewString);
    //         return;
    //     }
    //     char curChar = str.charAt(index);
    //     Subsequence(str, NewString+curChar, index+1);
    //     Subsequence(str, NewString, index+1);
    // }

    // public static void main(String[] args) {
    //     String str = "abc";
    //     Subsequence(str, "", 0);
    // }



    // public static void Subsequence2(String str, String NewString, int index, HashSet<String> set){
    //     if (index == str.length()) {
    //         if(set.contains(NewString)){
    //             return;
    //         }
    //         else{
    //             set.add(NewString);
    //             System.out.println(NewString);
    //             return;
    //         }
    //     }
    //     char curChar = str.charAt(index);
    //     Subsequence(str, NewString+curChar, index+1, set);
    //     Subsequence(str, NewString, index+1, set);
    // }

    // public static void main(String[] args) {
    //     String str = "aaa";
    //     HashSet<String> set = new HashSet<>();
    //     Subsequence2(str, "", 0, set);
    // }



    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination){
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }
}