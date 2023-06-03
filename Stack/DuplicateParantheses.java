import java.util.*;

public class DuplicateParantheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            int count;
            if (ch == ')') {
                count = 0;
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (s.size() == 0) {
                    System.out.print("String is Invalid That's why result is " + "");
                    return false;
                }
                if (count == 0) {
                    return true;
                } else {
                    s.pop();
                }
            } // opening, operator and opperand
            else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(isDuplicate(str));

        String str2 = "(a-b)";
        System.out.println(isDuplicate(str2));

        String str3 = "(a-b))";
        System.out.println(isDuplicate(str3));
    }
}
