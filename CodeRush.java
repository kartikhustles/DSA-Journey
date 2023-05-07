import java.util.*;

public class CodeRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        int temp = 0;
        int ans = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                temp = arr1[j] - arr1[i];
                for (int k = 0; k < arr2.length; k++) {
                    if (temp == arr2[k]) {
                        ans += temp;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
