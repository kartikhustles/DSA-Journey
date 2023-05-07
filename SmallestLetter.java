import java.util.*;

public class SmallestLetter {
    public static void main(String[] args) {
        int[] arr = {'c', 'f', 'j'};
        int target = 'j';
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}    