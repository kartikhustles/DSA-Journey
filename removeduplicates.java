import java.util.*;

public class removeduplicates {
    public static void main(String[] args) {
        String s = "appnnacollege";
        removeDuplicates(s, 0, new StringBuilder(""), new boolean[26]);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder sb, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, sb, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, sb.append(currChar), map);
        }
    }
}
