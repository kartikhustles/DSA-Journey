// // 1071. Greatest Common Divisor of Strings
// //
// https://leetcode.com/problems/greatest-common-divisor-of-strings/description/

// import java.util.*;

// class pending {
// public static void main(String[] args) {
// String str1 = "ABCABC", str2 = "ABC";
// System.out.println(gcdOfStrings(str1, str2));
// }

// public static String gcdOfStrings(String t, String s) {
// int[] key = new int[26];

// for (int i = 0; i < t.length(); i++)
// key[t.charAt(i) - 'A'] += 1;

// for (int i = 0; i < s.length(); i++)
// key[s.charAt(i) - 'A'] -= 1;

// for (int i = 0; i < key.length; i++) {
// if (key[i] < 0) {
// return "";
// }
// }

// String ans = "";
// for (int i = 0; i < key.length; i++) {
// if (key[i] == 1) {
// ans += (i + 'A');
// }
// }
// return ans;
// }
// }

// 391. Perfect Rectangle
// https://leetcode.com/problems/perfect-rectangle/
// ans - https://www.youtube.com/watch?v=X8V4UyDcuYQ

// // 390. Elimination Game
// // https://leetcode.com/problems/elimination-game/description/
// // ans - https://www.youtube.com/watch?v=LVfj1KefZAQ

// import java.util.*;

// public class pending {
// public static void main(String[] args) {
// System.out.println(lastRemaining(6));
// }

// public static int lastRemaining(int n) {
// ArrayList<Integer> key = new ArrayList<Integer>(n);
// for (int i = 1; i <= n; i++) {
// key.add(i);
// }
// while (key.size() != 1) {
// for (int i = 0; i < key.size(); i++) {
// key.remove(i);
// }
// for (int i = 1; i < key.size(); i++) {
// key.remove(i);
// }
// }
// return key.get(0);
// // while (key.size() != 1) {
// // key.remove(key)
// // }
// }
// }

// // 388. Longest Absolute File Path
// // https://leetcode.com/problems/longest-absolute-file-path/description/

// // https://leetcode.com/problems/lexicographical-numbers/
// // 386. Lexicographical Numbers
// // DP approach

// import java.util.*;

// public class pending {
// public static void main(String[] args) {
// int n = 13;
// System.out.println(lexicalOrder(n));
// }

// public static List<Integer> lexicalOrder(int n) {
// List<Integer> ans = new ArrayList<>(n);
// ans.add(1);
// for (int i = 1, prev = 1; i < n; i++) {
// if (prev * 10 <= n) {
// prev *= 10;
// } else {
// while (prev % 10 == 9 || prev == n)
// prev /= 10;
// prev++;
// }
// ans.add(prev);
// }
// return ans;
// }
// }
