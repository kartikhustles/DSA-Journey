import java.util.*;

public class tilingproblem {
    public static void main(String[] args) {
        System.out.println(tilingproblem(3));
    }

    public static int tilingproblem(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // main
        // vertical choice
        int fnm1 = tilingproblem(n - 1);

        // horizontal choice
        int fnm2 = tilingproblem(n - 2);

        int totalways = fnm1 + fnm2;

        return totalways;

    }
}
