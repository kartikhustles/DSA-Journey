import java.util.*;

public class MaximumLengthChainOfPairs {
    public static void main(String[] args) {
        int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));

        int chainLen = Math.abs(pair[0][0] - pair[0][1]);
        int numberLen = 1;
        int chainEnd = pair[0][1]; // Last selected Chain pair end

        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] > chainEnd) {
                chainLen += Math.abs(pair[i][0] - pair[i][1]);
                numberLen++;
                chainEnd = pair[i][1];
            }
        }

        System.out.println("Number of Chain = " + numberLen);
        System.out.println("Max Length of Chain = " + chainLen);
    }
}
