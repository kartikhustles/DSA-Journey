public class GridWays {
    public static int Solution(int i, int j, int n, int m) {
        if (i == n - 1 && j == m - 1) { // Condition for last cell
            return 1;
        } else if (i == n || j == m) { // Boundary Cross Condition
            return 0;
        }

        int w1 = Solution(i + 1, j, n, m);
        int w2 = Solution(i, j + 1, n, m);

        return w1 + w2;
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(Solution(0, 0, n, m));
    }
}
