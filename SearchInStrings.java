import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kartik";
        char target = 'a';

        System.out.println(search1(name, target));

        System.out.println(search2(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }

// Method 1

    static boolean search1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

// Method 2

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}