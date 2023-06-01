import java.util.*;

class ChineseRemainder {

    int calculate(int size, int div[], int rem[]) {
        int j, x = 1;
        while (true) {
            for (j = 0; j < size; j++) {
                if (x % div[j] != rem[j])
                    break;
            }
            if (j == size)
                return x;
            x++;
        }
    }
}

class ChineseRemainderTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Diviser");
        int size = sc.nextInt();
        int[] div = new int[size];
        for (int i = 0; i < n; i++) {
            div[i] = sc.nextInt();
        }

        System.out.println("Enter Remainder");
        int rem[] = new int[size];
        for (int i = 0; i < size; i++) {
            rem[i] = sc.nextInt();
        }

        ChineseRemainder c = new ChineseRemainder();
        System.out.println(c.calculate(size, div, rem));
    }
}