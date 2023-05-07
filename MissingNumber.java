import java.util.Arrays;

// 268

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            }
            else{
                i++;
            }
        }

        // case 1
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
