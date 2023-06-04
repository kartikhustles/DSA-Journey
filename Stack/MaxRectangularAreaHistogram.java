import java.util.*;

public class MaxRectangularAreaHistogram {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        Stack<Integer> sl = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!sl.isEmpty() && arr[sl.peek()] >= arr[i]) {
                sl.pop();
            }
            if (sl.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = sl.peek();
            }
            sl.push(i);
        }

        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i] * (nsr[i] - nsl[i] - 1); // height * width
            maxArea = Math.max(maxArea, temp);
        }

        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maxArea(arr);
    }
}
