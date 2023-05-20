import java.util.*;

public class check {
    public static void main(String[] args) {
        int[] arr = { 8, 6, 4, 2, 3, 5, 7, 1 };
        System.out.println(sort(arr));
    }

    static ArrayList<Integer> sort(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int idx = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[idx]) {
                swap(arr, i, idx);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (j + 1 != arr[j]) {
                ans.add(j + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}