import java.util.*;

public class GameProject {
    public static void main(String[] args) {
        int zeros = 0, positive = 0, negative = 0;
        for (int i = 1; ; i++) {
            System.out.println("Enter 1 to Continue and 0 to Stop");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();

            if (input == 1) {
                System.out.println("Enter a Number");
                int num = sc.nextInt();
                if (num > 0) {
                    positive++;
                } else if (num == 0) {
                    zeros++;
                } else {
                    negative++;
                }
            } else if (input == 0) {
                break;
            }
        }

        System.out.println("Zeros are :" + zeros);
        System.out.println("Positive Numbers are : " + positive);
        System.out.println("Negative Numbers are : " + negative);

    }
}