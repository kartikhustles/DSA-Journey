import java.lang.String;

public class Strings {
    // public static void main(String[] args) {
    //     String str1 = "abcd";
    //     String str2 = new String("xyz");
    //     char[] ch = {'a', 'b', 'c', 'd'};

    //     // Strings are IMMUTABLE
    //     // Use length, Concatenation, charAt function

    //     String str = "racecar";
    //     System.out.println(IsPalindrome(str));
    // }

    // public static boolean IsPalindrome(String str) {
    //     int n = str.length();
    //     for (int i = 0; i < n/2; i++) {
    //         if (str.charAt(i) != str.charAt(n-1-i)) {
    //             // Not a Palindrome
    //             return false;
    //         }
    //     }

    //     return true;
    // }

    // // Substring function


    // Comparision -> 1) Lexicographic
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

    System.out.println(largest);    
    }
}
