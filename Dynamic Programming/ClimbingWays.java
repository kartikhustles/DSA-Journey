import java.util.Arrays;

public class ClimbingWays {
    // // NORMAL method O(2^n)
    // public static int climb(int n) {
    // if (n == 0) {
    // return 1;
    // }
    // if (n < 0) {
    // return 0;
    // }
    // return climb(n - 1) + climb(n - 2);
    // }

    // public static void main(String[] args) {
    // int n = 5;
    // System.out.println(climb(n));
    // }

    // memoization O(n)
    public static int countways(int n, int[] ways) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        if (ways[n] != -1) { // already calculated
            return ways[n];
        }

        ways[n] = countways(n - 1, ways) + countways(n - 2, ways);
        return ways[n];
    }

    public static void main(String[] args) {
        int n = 5; // n = 3 -> 3 & n = 4 -> n = 5 -> 8
        int ways[] = new int[n + 1]; // 0 0 0 0
        Arrays.fill(ways, -1);
        System.out.println(countways(n, ways));
    }

}
