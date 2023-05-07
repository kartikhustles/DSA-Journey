public class test {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] - (mid + 1) < k)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start + k;
    }
}

// // GFG save flowers
// // GFG Weekly Coding Contest 92

// public class test {
// public static void main(String[] args) {
// int n = 5;
// int[] arr = { 3, 5, 2, 9, 1 };
// String s = "00110";
// System.out.println(saveFlowers(n, arr, s));
// }

// public static int saveFlowers(int n, int a[], String s) {
// int lid = 0;
// for (int i = 0; i < s.length(); i++) {
// if (s.charAt(i) == '1') {
// lid++;
// }
// }
// if (lid == 0) {
// return 0;
// } else if (lid == n) {
// int ans = 0;
// for (int i = 0; i < a.length; i++) {
// ans += a[i];
// }
// return ans;
// }
// return save(a, lid, 0, 0, 0, 0);
// }

// public static int save(int[] a, int lid, int count, int i, int temp, int max)
// {
// if (count == lid || i == a.length - 1) {
// max = Math.max(max, temp);
// return max;
// }
// int take = save(a, lid, count + 1, i + 1, temp + a[i], (int) Math.max(max,
// temp + a[i]));
// int ntake = save(a, lid, count, i + 1, temp, max);
// return Math.max(take, ntake);
// }
// }

// public class test {
// public static void main(String[] args) {
// int[] nums = { 4, 6, 32, 9, 90, 5 };
// System.out.println(findValidSplit(nums));
// }

// public static int findValidSplit(int[] nums) {
// long pp = 1;
// long sp = 1;
// for (int i = 0; i < nums.length - 1; i++) {
// pp = 1;
// sp = 1;
// for (int j = 0; j < nums.length; j++) {
// if (j <= i) {
// pp *= nums[j];
// } else {
// sp *= nums[j];
// }
// }
// if (gcd(pp, sp) == 1) {
// return i;
// }
// }
// return -1;
// }

// public static long gcd(long a, long b) {
// if (a == 0) {
// return b;
// }
// return gcd(b % a, a);
// }
// }

// public class test {
// public static void main(String[] args) {
// System.out.println(coloredCells(5));
// }

// public static long coloredCells(int n) {
// if (n == 0) {
// return 0;
// }
// int ans = 0;
// for (int i = 1; i <= n; i++) {
// if (i == 1) {
// ans += 1;
// } else if (i == 2) {
// ans += 4;
// } else {
// ans += (i - 2) * 8;
// }
// }
// return ans;
// }
// }

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
// // 1342. Number of Steps to Reduce a Number to Zero
// // 32/35 test cases passed

// public class test {
// public static void main(String[] args) {
// int[] profits = { 1, 2, 3 };
// int[] capital = { 0, 1, 2 };
// System.out.println(findMaximizedCapital(0, 0, profits, capital));
// }

// public static int findMaximizedCapital(int k, int w, int[] profits, int[]
// capital) {
// int max = Integer.MIN_VALUE;
// int key = 0;
// while (k != 0) {
// for (int j = 0; j < capital.length; j++) {
// if (capital[j] <= w && max < profits[j]) {
// max = profits[j];
// key = j;
// }
// }
// w += max;
// max = 0;
// capital[key] = Integer.MAX_VALUE;
// k -= 1;
// }
// if (w == Integer.MIN_VALUE) {
// return 0;
// }
// return w;
// }
// }

// import java.lang.reflect.Array;
// import java.util.*;

// public class test {
// public static void main(String[] args) {
// int[][] nums1 = { { 1, 2 }, { 2, 3 }, { 4, 5 } }, nums2 = { { 1, 4 }, { 3, 2
// }, { 4, 1 } };
// System.out.println(mergeArrays(nums1, nums2));
// }

// // public static ArrayList<ArrayList<Object>> mergeArrays(int[][] nums1,
// int[][]
// // nums2) {
// // ArrayList<ArrayList<Object>> a = new
// // ArrayList<ArrayList<Object>>(nums1.length);
// // int temp = 0;
// // for (int i = 0; i < nums1.length; i++) {
// // if (nums1[i][0] == nums2[i][0]) {
// // temp = nums1[i][1] + nums2[i][1];
// // a.subList(nums1[i][0], temp);
// // }
// // }
// // return a;
// // }

// public static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
// int[] count = new int[10];
// for (int i = 0; i < nums1.length; i++) {
// count[nums1[i][0]]++;
// if (i < nums2.length) {
// count[nums2[i][0]]++;
// }
// }
// int key = 0;
// for (int i = 0; i < count.length; i++) {
// if (count[i] != 0) {
// key++;
// }
// }
// int[][] ans = new int[key][2];
// for (int i = 0, j = 0; i < nums1.length; i++, j++) {
// if (nums1[i][0] == nums2[i][0]) {
// ans[j][0] = nums1[i][0];
// ans[j][1] = nums1[i][1] + nums2[i][1];
// count[nums2[i][0]] -= 2;
// } else if (nums1[i][0] > nums2[i][0]) {
// ans[j][0] = nums2[i][0];
// ans[j][1] = nums2[i][1] + nums2[i][1];
// j++;
// ans[j][0] = nums1[i][0];
// ans[j][1] = nums1[i][1] + nums1[i][1];
// } else {
// ans[j][0] = nums1[i][0];
// ans[j][1] = nums1[i][1] + nums1[i][1];
// j++;
// ans[j][0] = nums2[i][0];
// ans[j][1] = nums2[i][1] + nums2[i][1];
// }

// }
// return ans;
// }
// }

// // Maximum Difference by Remapping a Digit

// import java.util.*;

// public class test {
// public static void main(String[] args) {
// int num = 99999;
// System.out.println(minMaxDifference(num));
// }

// public static int minMaxDifference(int num) {
// ArrayList key = new ArrayList<Integer>();
// int num1 = num;
// int temp = -1;
// while (num != 0) {
// temp = num % 10;
// key.add(0, temp);
// num /= 10;
// }
// int ans1 = (int) key.get(0);
// int ans = 9;
// int i = 0;
// while (ans == 9 & i < key.size()) {
// ans = (int) key.get(i);
// i++;
// }
// if (ans == 9) {
// return num1;
// }
// int max = 0;
// int low = 0;
// for (int j = 0; j < key.size(); j++) {
// if (ans == (int) key.get(j)) {
// max = max * 10 + 9;
// } else {
// max = max * 10 + (int) key.get(j);
// }
// if (ans1 == (int) key.get(j)) {
// low = low * 10 + 0;
// } else {
// low = low * 10 + (int) key.get(j);
// }
// }
// return max - low;
// }

// public static int minMaxDifference(int num) {
// int nums = num;
// int numss = num;
// int ans = -1;
// int count = 0;
// while (num != 0) {
// ans = num % 10;
// num /= 10;
// count++;
// }
// int high = 0;
// int temp = -1;
// while (nums != 0) {
// temp = nums % 10;
// nums /= 10;
// if (temp == ans) {
// temp = 9;
// }
// high = (high * 10) + temp;
// }
// // for (int i = 0; i <= count; i++) {
// // temp = nums % 10;
// // nums /= 10;
// // if (temp == ans) {
// // temp = 9;
// // }
// // high = (high * 10) + temp;
// // }

// int low = 0;
// int temp1 = -1;
// for (int i = 0; i < count - 1; i++) {
// temp1 = numss % 10;
// numss /= 10;
// if (temp1 == ans) {
// temp1 = 0;
// }
// low = (low * 10) + temp1;
// }

// return high;
// }
// }

// import java.util.*;

// class test {
// public static void main(String[] args) {
// // String s = "abcba";
// String s = "leetcode";

// System.out.println(firstUniqChar(s));
// }

// public static int firstUniqChar(String s) {
// int[] key = new int[26];
// for (int i = 0; i < s.length(); i++) {
// key[s.charAt(i) - 'a'] += 1;
// }
// for (int i = 0; i < s.length(); i++) {
// if (key[s.charAt(i) - 'a'] == 1) {
// return i;
// }
// }
// return -1;
// }
// }

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[] nums = { 1, 7, 9, 2, 5 };
// int lower = 11;
// int upper = 11;

// // int[] nums = { 0, 1, 7, 4, 4, 5 };
// // int lower = 3;
// // int upper = 6;
// System.out.println(countFairPairs(nums, lower, upper));
// }

// public static long countFairPairs(int[] nums, int lower, int upper) {
// int count = 0;
// for (int i = 0; i < nums.length; i++) {
// for (int j = 0; j < nums.length; j++) {
// if (0 <= i && i < j && j < nums.length && lower <= nums[i] + nums[j] &&
// nums[i] + nums[j] <= upper) {
// count++;
// }
// }
// }
// return count;
// }

// }

// public static long countFairPairs(int[] nums, int lower, int upper) {
// int count = 0;
// int opsize = (int)Math.pow(2, n);
// /* Run from counter 000..1 to 111..1*/
// for (int counter = 1; counter < opsize; counter++)
// {
// for (int j = 0; j < n; j++)
// {
// /* Check if jth bit in the counter is set
// If set then print jth element from arr[] */

// if (BigInteger.valueOf(counter).testBit(j))
// System.out.print(arr[j]+" ");
// }
// System.out.println();
// }
// }

// for(

// int i = 0;i<nums.length;i++)
// {
// for (int j = 0; j < nums.length; j++) {
// if (0 <= i && i < j && j < nums.length && lower <= nums[i] + nums[j] &&
// nums[i] + nums[j] <= upper) {
// count++;
// }
// }
// }return count;
// }

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[] nums = { 7, 52, 2, 4 };
// System.out.println(findTheArrayConcVal(nums));
// }

// public static long findTheArrayConcVal(int[] nums) {
// long ans = 0;
// long temp = 0;
// long i = 0;
// long count = 0;
// if (nums.length % 2 == 0) {
// count = 1;
// }
// while (count <= nums.length / 2) {
// if (i != nums.length - 1 - i) {
// temp = nums[(int) (nums.length - 1 - i)] + (nums[(int) i] * digit(nums[(int)
// (nums.length - 1 - i)]));
// System.out.println(temp);
// } else {
// temp = nums[(int) i];
// System.out.println(temp);
// }
// ans = ans + temp;
// i++;
// count++;
// }
// return ans;
// }

// public static int digit(int n) {
// int ans = 10;
// if (n >= 10 && n <= 99) {
// ans = 100;
// } else if (n >= 100 && n <= 999) {
// ans = 1000;
// } else if (n >= 1000 && n <= 9999) {
// ans = 10000;
// }
// return ans;
// }
// }

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[] prices = { 7, 2, 1, 4, 3, 6 };
// System.out.println(maxProfit(prices));
// }

// public static int maxProfit(int[] prices) {
// ArrayList<Integer> temp = new ArrayList<Integer>();
// int count = 0;
// int profit = 0;
// int totalprofit = 0;
// for (int i = 0; i < prices.length - 1; i++) {
// if (prices[i] <= prices[i + 1]) {
// profit = prices[i + 1] - prices[i];
// totalprofit = totalprofit + profit;
// count++;
// temp.add(profit);
// }
// }
// if (count <= 2) {
// return totalprofit;
// } else {
// for (int i = 0; i < temp.size(); i++) {

// }
// }
// }
// }

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[][] matrix = { { 1, 2, 3 },
// { 4, 5, 6 },
// { 7, 8, 9 } };
// System.out.println(spiralOrder(matrix));
// }

// public static List<Integer> spiralOrder(int[][] matrix) {
// ArrayList<Integer> ans = new ArrayList<Integer>();
// int startRow = 0;
// int startCol = 0;
// int endRow = matrix.length - 1;
// int endCol = matrix[0].length - 1;

// while (startCol <= endCol && startRow <= endRow) {
// // top
// for (int i = startCol; i <= endCol; i++) {
// ans.add(matrix[startRow][i]);
// }

// // right
// for (int i = startRow + 1; i <= endRow; i++) {
// ans.add(matrix[i][endCol]);
// }

// // bottom
// for (int i = endCol - 1; i >= startCol; i--) {
// if (startRow == endRow) {
// return ans;
// }
// ans.add(matrix[endRow][i]);
// }

// // left
// for (int i = endRow - 1; i >= startRow + 1; i--) {
// if (startCol == endCol) {
// return ans;
// }
// ans.add(matrix[i][startCol]);
// }

// startCol++;
// startRow++;
// endCol--;
// endRow--;
// }
// return ans;
// }

// public static boolean searchMatrix(int[][] matrix, int target) {
// int row = 0;
// int col = matrix[0].length - 1;
// while (row <= matrix.length - 1 && col >= 0) {
// if (target == matrix[row][col]) {
// System.out.println("Key Found at (" + row + ", " + col + ")");
// return true;
// } else if (matrix[row][col] > target) {
// col--;
// } else {
// row++;
// }
// }
// System.out.println("Key Dosen't Found in the given matrix");
// return false;
// }
// }
// // https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// // 26. Remove Duplicates from Sorted Array

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
// System.out.println(removeDuplicates(nums));
// }

// public static List<Integer> removeDuplicates(int[] nums) {
// ArrayList<Integer> ans = new ArrayList<Integer>();
// int count = 0;
// int temp = Integer.MIN_VALUE;
// for (int i = 0; i < nums.length; i++) {
// if (nums[i] != temp) {
// temp = nums[i];
// ans.add(temp);
// count++;
// }
// }
// return ans;
// }
// }

// // https://leetcode.com/problems/plus-one/

// // 66. Plus One

// import java.util.*;

// class test {

// public static List<Integer> plusOne(int[] num) {
// int k = 1;
// ArrayList<Integer> ans = new ArrayList<Integer>();
// long fsum = 0;
// for (int i = 0; i < num.length; i++) {
// fsum = fsum + (num[i] * (long) Math.pow(10, num.length - (1 + i)));
// }
// long msum = fsum + k;
// long count = digits(msum);
// int i = 0;
// while (msum >= 1) {
// int div = (int) Math.pow(10, count - (1 + i));
// System.out.println(div);
// ans.add((int) (msum / div));
// msum = msum % div;
// i++;
// }
// return ans;
// }

// public static int digits(long msum) {
// int count = 0;
// while (msum != 0) {
// msum = msum / 10;
// count++;
// }
// return count;
// }
// }

// https://leetcode.com/problems/add-to-array-form-of-integer/description/

// 989. Add to Array-Form of Integer

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[] matrix = { 9, 9, 9, 9, 9, 9, 9, 9, 9 };
// int k = 1;
// System.out.println(addToArrayForm(matrix, k));
// }

// // public static List<Integer> addToArrayForm(int[] num, int k) {
// // ArrayList<Integer> ans = new ArrayList<Integer>();
// // long temp = 0;
// // for (int i = 0; i < num.length; i++) {
// // temp = temp + (num[i] * (long) Math.pow(10, num.length - (1 + i)));
// // }
// // long fin = temp + k;
// // for (int i = 0; i < num.length; i++) {
// // int ka = (int) Math.pow(10, num.length - (1 + i));
// // long fina = fin / ka;
// // if (fina >= 10) {
// // int ans1 = (int) fina / 10;
// // int ans2 = (int) fina % 10;
// // ans.add(ans1);
// // ans.add(ans2);
// // } else {
// // int ans1 = (int) fina;
// // ans.add(ans1);
// // }
// // fin = fin - (ka * fina);
// // }
// // return ans;
// // }

// public static List<Integer> addToArrayForm(int[] num, int k) {
// ArrayList<Integer> ans = new ArrayList<Integer>();
// long fsum = 0;
// for (int i = 0; i < num.length; i++) {
// fsum = fsum + (num[i] * (long) Math.pow(10, num.length - (1 + i)));
// }
// long msum = fsum + k;
// long count = digits(msum);
// int i = 0;
// while (msum >= 1) {
// int div = (int) Math.pow(10, count - (1 + i));
// System.out.println(div);
// ans.add((int) (msum / div));
// msum = msum % div;
// i++;
// }
// return ans;
// }

// public static int digits(long msum) {
// int count = 0;
// while (msum != 0) {
// msum = msum / 10;
// count++;
// }
// return count;
// }

// }

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[][] mat = { { 0, 1 }, { 1, 0 } };
// int[][] target = { { 1, 0 }, { 0, 1 } };
// System.out.println(findRotation(mat, target));
// }

// public static boolean findRotation(int[][] mat, int[][] target) {
// for (int i = 0; i < 4; i++) {
// if (isEqual(mat, target))
// return true;
// mat = rotate(mat);
// }
// return false;
// }

// // Function to rotate matrix by 90 degree using transpose
// public static int[][] rotate(int[][] mat) {
// int[][] check = mat;
// int m = check.length;
// // First transposing the matrix
// for (int col = 0; col < m; col++) {
// for (int row = 1 + col; row < m; row++) {
// int temp = check[row][col];
// check[row][col] = check[col][row];
// check[col][row] = temp;
// }
// }

// // Now swapping coloumns like said in start
// for (int col_1 = 0, col_2 = m - 1; col_1 < m / 2; col_1++, col_2--) {
// for (int row = 0; row < m; row++) {
// int temp = check[row][col_1];
// check[row][col_1] = check[row][col_2];
// check[row][col_2] = temp;
// }
// }
// return check;
// }

// // Function to check whether two matrix are equal
// public static boolean isEqual(int[][] m1, int[][] m2) {
// if (m1.length != m2.length)
// return false;
// if (m1[0].length != m2[0].length)
// return false;
// for (int row = 0; row < m1.length; row++) {
// for (int col = 0; col < m1[0].length; col++) {
// if (m1[row][col] != m2[row][col])
// return false;
// }
// }
// return true;
// }

// }

// // 6303

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[] test = { 13, 25, 83, 77 };
// sseparateDigits(test);
// }

// public static int[] sseparateDigits(int[] nums) {
// // ArrayList<Integer> ans = new ArrayList<Integer>(nums.length);
// int totalk = 0;
// for (int i = 0; i < nums.length; i++) {
// int key = 0;
// if (nums[i] <= 9) {
// key = 1;
// } else if (nums[i] <= 99) {
// key = 2;
// } else if (nums[i] <= 999) {
// key = 3;
// } else if (nums[i] <= 9999) {
// key = 4;
// } else if (nums[i] <= 99999) {
// key = 5;
// }
// totalk = totalk + key;
// }
// int[] ans = new int[totalk];
// int j = 0;
// for (int i = 0; i < ans.length; i++) {
// int key = 0;
// {
// if (nums[j] <= 9) {
// key = 1;
// } else if (nums[j] <= 99) {
// key = 2;
// } else if (nums[j] <= 999) {
// key = 3;
// } else if (nums[j] <= 9999) {
// key = 4;
// } else if (nums[j] <= 99999) {
// key = 5;
// }
// j++;
// }
// if (key == 1) {
// int first = nums[j];
// // ans.add(first);
// ans[i] = first;
// i++;
// } else if (key == 2) {
// int second = nums[j] / 10;
// int first = nums[j] - second;
// ans[i] = second;
// i++;
// ans[i] = first;
// i++;
// } else if (key == 3) {
// int third = nums[j] / 100;
// int second = (nums[j] - third) / 10;
// int first = nums[j] - second;
// ans[i] = third;
// i++;
// ans[i] = second;
// i++;
// ans[i] = first;
// i++;
// } else if (key == 4) {
// int fourth = nums[j] / 1000;
// int third = (nums[j] - fourth) / 100;
// int second = (nums[j] - third) / 10;
// int first = nums[j] - second;
// ans[i] = fourth;
// i++;
// ans[i] = third;
// i++;
// ans[i] = second;
// i++;
// ans[i] = first;
// i++;
// } else if (key == 5) {
// int fifth = nums[j] / 1000;
// int fourth = (nums[j] - fifth) / 1000;
// int third = (nums[j] - fourth) / 100;
// int second = (nums[j] - third) / 10;
// int first = nums[j] - second;
// ans[i] = fifth;
// i++;
// ans[i] = fourth;
// i++;
// ans[i] = third;
// i++;
// ans[i] = second;
// i++;
// ans[i] = first;
// i++;
// }
// }
// return ans;
// }
// }

// // https://leetcode.com/problems/flipping-an-image/description/

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int[][] nums = { { 1, 1, 0 },
// { 1, 0, 1 },
// { 0, 0, 0 }
// };
// int[][] ans = flipAndInvertImage(nums);
// }

// public static int[][] flipAndInvertImage(int[][] image) {
// for (int i = 0; i < image.length; i++) {
// for (int j = 0; j < image.length; j++) {
// if (image[i][j] != image[i - 1][j - 1]) {
// int temp = image[i][j];
// image[i][j] = image[i - 1][j - 1];
// image[i - 1][j - 1] = temp;
// }
// }
// }
// for (int i = 0; i < image.length; i++) {
// for (int j = 0; j < image.length; j++) {
// System.out.println(image[i][j]);
// }
// }
// return image;
// }
// }

// import java.util.*;

// class test {
// public static void main(String[] args) {
// int nums[] = { 0, 1, 2, 3, 4 };
// int index[] = { 0, 1, 2, 2, 1 };
// createTargetArray(nums, index);
// }

// public static int[] createTargetArray(int[] nums, int[] index) {
// int[] ans = new int[nums.length];
// for (int i = 0; i < index.length; i++) {
// if (index[i] < i) {

// } else {
// ans[i] = nums[index[i]];
// }
// }
// System.out.println(Arrays.toString(ans));
// return ans;
// }
// }

// import java.util.*;

// class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// int amount1 = sc.nextInt();

// int amount2 = sc.nextInt();

// int amount3 = sc.nextInt();

// int cond = 0;
// cond = MoneyExchange(amount1, cond);
// System.out.println();
// System.out.println("Total Thousand Currency Notes " + cond);
// cond = cond + MoneyExchange(amount2, cond);
// System.out.println();
// System.out.println("Total Thousand Currency Notes " + cond);
// cond = cond + MoneyExchange(amount3, cond);
// System.out.println();
// System.out.println("Total Thousand Currency Notes " + cond);
// }

// public static int MoneyExchange(int prevamount, int cond) {
// int amount = prevamount;
// int thhs = 0;
// int fhs = 0;
// int ths = 0;
// int fs = 0;

// while (amount >= 1000 && cond <= 9) {
// if (amount > 10000) {
// thhs = 10;
// amount = amount - 10000;
// break;
// } else {
// if (cond <= 10) {
// thhs = amount / 1000;
// amount = amount - (thhs * 1000);
// cond++;
// } else {
// break;
// }
// }
// }

// while (amount >= 500) {
// fhs = amount / 500;
// amount = amount - (fhs * 500);
// }

// while (amount >= 200) {
// ths = amount / 200;
// amount = amount - (ths * 200);
// }

// while (amount >= 50) {
// fs = amount / 50;
// amount = amount - (fs * 50);
// }
// System.out.println("**************Money Exchange Counter**************");
// System.out.println("previous amount was " + prevamount);
// System.out.println("No. of 1000 Currency Notes " + thhs);
// System.out.println("No. of 500 Currency Notes " + fhs);
// System.out.println("No. of 200 Currency Notes " + ths);
// System.out.println("No. of 50 Currency Notes " + fs);
// System.out.println();
// System.out.println();
// System.out.println();
// return thhs;
// }
// }

// import java.lang.reflect.Array;
// import java.util.*;;

// class test {
// public static void main(String[] args) {
// int[] arr = { 2, 3, 5, 1, 3 };
// numIdenticalPairs(arr);
// }

// public static int numIdenticalPairs(int[] nums) {
// int n = nums.length;
// int[] ans = new int[n];
// for (int i = 0; i < nums.length; i++) {
// int count = 0;
// for (int j = 0; j < nums.length; j++) {
// if (nums[i] > nums[j] && j != i) {
// count++;
// }
// }
// nums[i] = count;
// }
// return ans;
// }
// }

// import java.util.*;
// import java.util.Arrays;

// import javax.lang.model.element.Element;

// public class test {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the size of the Array : ");
// int size = sc.nextInt();

// int[] arr = new int[size];

// for (int i = 0; i < arr.length; i++) {
// System.out.print("Enter the : " +i+ "th size of the Array : ");
// arr[i] = sc.nextInt();
// }

// System.out.println(Arrays.toString(arr));

// // for (int i = 0; i < arr.length; i++) {
// // System.out.print(arr[i]+ " ");
// // }

// // Scanner sc = new Scanner(System.in);
// // int n = sc.nextInt();
// // int rem = 0;
// // int ans = 0;
// // while (n>0) {
// // rem = n % 10;
// // n = n/10;
// // ans = (ans*10) + rem;
// // }
// // System.out.println(ans);

// // Scanner in = new Scanner(System.in);
// // int n = in.nextInt();
// // rev(n);
// // }

// // static void rev (int n) {
// // int ans = 0;
// // while(n > 0){
// // int rem = n % 10;
// // n = n / 10;
// // ans = (ans)*10 + rem;
// // }
// // System.out.println(ans);

// }
// }

// Write a function to check if a given triplet is a Pythagorean triplet or not.
// (A Pythagorean triplet
// is when the sum of the square of two numbers is equal to the square of the
// third number).
// https://www.geeksforgeeks.org/find-pythagorean-triplet-in-an-unsorted-array/

// Reversing a String
// https://www.geeksforgeeks.org/reverse-a-string-in-java/

// 1672 Richest Customer Wealth

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.println("Enter m and n Repectively : ");

// int m = sc.nextInt();
// int n = sc.nextInt();
// int sum;

// int[][] arr = new int[m][n];

// for (int row = 0; row < arr.length; row++) {
// for (int col = 0; col < arr[row].length; col++) {
// arr[row][col] = sc.nextInt();
// }
// }

// for(int[] b : arr){
// System.out.println(Arrays.toString(b));
// }
// }

// // 1470 Shuffle the Array
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int[] arr = new int[n];
// int[] str = new int[n];

// for (int i = 0; i < arr.length; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.println(Arrays.toString(arr));
// }

// // 1431 Kids With the Greatest Number of Candies

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter the size of the Array : ");
// int n = sc.nextInt();
// System.out.print("Extra Candies : ");
// int extra = sc.nextInt();

// int[] arr = new int[n];

// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// int max = 0;

// for (int i = 0; i < n; i++) {
// max = arr[i];
// arr[i] = arr[i] + extra;
// for (int j = 0; j < n; j++) {
// if(arr[i] <= arr[j]){
// max = arr[j];
// }
// }
// if (max >= arr[i]) {
// System.out.println("Kid " +(i+1)+ ", they will have " +max+ "candies, which
// is the greatest among the kids.");
// }
// else if(max <= arr[i]){
// System.out.println("Kid " +(i+1)+ ", they will have " +max+ "candies, which
// is not the greatest among the kids.");
// }
// // System.out.println("Maximum No. of Candies is : " +max);
// }
// }

// import java.io.*;
// import java.util.*;

// public class check {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String input = sc.next();
// StringBuilder sb = new StringBuilder(input);
// // StringBuilder output = new StringBuilder(input);

// for(int i = 0; i < sb.length()/2; i++) {
// int front = i;
// int back = sb.length() - 1 - i; // 5 - 1 - 0 => 4

// char frontChar = sb.charAt(front);
// char backChar = sb.charAt(back);

// sb.setCharAt(front, backChar);
// sb.setCharAt(back, frontChar);
// }
// String output = sb.toString();
// System.out.println(input);
// System.out.println(output);
// if(output == input){
// System.out.println("Yes");
// }
// else{
// System.out.println("No");
// }
// }
// }