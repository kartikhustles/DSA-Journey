import java.net.Socket;
import java.util.Scanner;

public class stringfun {
    public static void main(String[] args) {
                // String Function

        // 1. substring(beg index, end index)

        // 2. charAt()

        // 3. Strings are immutable

        // 4. fun1.compareTo(fun2)  // Here fun1 and fun2 are name of the two strings
                                    // Here 0 is equal to
                                    // Here +ve is fun1 > fun2
                                    // Here -ve is fun1 < fun2



        // String Builder Function
                                    

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        
        // char at index(0)

        System.out.println(sb.charAt(0));

        // replace char at index(0)
        sb.setCharAt(0, 'P');
        System.out.println(sb);


        // inserting new Char in existing String

        sb.insert(0, 'S');
        System.out.println(sb);


        sb.insert(2, 'n');
        System.out.println(sb);

        // delete the extra 'n'
        sb.delete(2, 3);
        System.out.println(sb);

        // delete the extra 'P'
        sb.delete(1, 2);
        System.out.println(sb);


        StringBuilder sbnew = new StringBuilder("H");
        
        sbnew.append("e");
        sbnew.append("l");
        sbnew.append("l");
        sbnew.append("o");
        sbnew.append(" ");
        sbnew.append("!");
        
        System.out.println(sbnew);
        System.out.println(sbnew.length());


        StringBuilder sbhello = new StringBuilder("hello");

        for(int i = 0; i < sb.length()/2; i++) {
            int front = i;
            int back = sbhello.length() - 1 - i; // 5 - 1 - 0 => 4

            char frontChar = sbhello.charAt(front);
            char backChar = sbhello.charAt(back);

            sbhello.setCharAt(front, backChar);
            sbhello.setCharAt(back, frontChar);
        }
        System.out.println(sbhello);
    }
}
