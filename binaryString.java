import java.util.*;

public class binaryString {
    public static void main(String[] args) {
        printBinStrings(1, 0, "");
    }

    public static void printBinStrings(int n, int lastplace, String sb) {
        // base case
        if (n == 0) {
            System.out.println(sb);
            return;
        }

        // main
        printBinStrings(n - 1, 0, sb + "0");
        if (lastplace == 0) {
            printBinStrings(n - 1, 1, sb + "1");
        }
    }
}
