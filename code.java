import java.util.*;

public class code {
    public static void main(String[] args) {
        String[] expressions = { "<<>>", "<>", "<><>", ">>", "<<>", "><><" };
        int[] maxReplacements = { 0, 1, 2, 2, 2, 2 };

        for (int i = 0; i < expressions.length; i++) {
            if (balancedOrNot(expressions[i], maxReplacements[i])) {
                System.out.println(expressions[i] + " can be balanced.");
            } else {
                System.out.println(expressions[i] + " cannot be balanced.");
            }
        }
    }

    static String[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < expressions.length; i++) {
            String expr = expressions[i];
            int maxRep = maxReplacements[i];
            int balanceCount = 0;
            int replacementCount = 0;
            for (int j = 0; j < expr.length(); j++) {
                char c = expr.charAt(j);
                if (c == '<') {
                    balanceCount++;
                } else {
                    if (balanceCount == 0) {
                        replacementCount++;
                    } else {
                        balanceCount--;
                    }
                }
            }
            if (balanceCount == 0 && replacementCount <= maxRep) {
                result.add("1");
            } else {
                result.add("0");
            }
        }
        return result.toArray(new String[result.size()]);
    }

}