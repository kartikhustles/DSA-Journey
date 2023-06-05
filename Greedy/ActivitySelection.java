import java.util.*;

public class ActivitySelection {

    // // If end time is given in sorted order
    // public static void main(String[] args) { // O(N)
    // int start[] = { 1, 3, 0, 5, 8, 5 };
    // int end[] = { 2, 4, 6, 7, 9, 9 };

    // // end time basis sorted
    // int maxAct = 0;
    // ArrayList<Integer> ans = new ArrayList<>();

    // // 1st Activity
    // maxAct = 1;
    // ans.add(0);
    // int lastEnd = end[0];
    // for (int i = 1; i < end.length; i++) {
    // if (start[i] >= lastEnd) {
    // // Activity Selected
    // maxAct++;
    // ans.add(i);
    // lastEnd = end[i];
    // }
    // }

    // System.out.println("max Activity = " + maxAct);
    // for (int i = 0; i < ans.size(); i++) {
    // System.out.println("Activity " + ans.get(i));
    // }
    // System.out.println();
    // }

    // If end time is given in sorted order
    public static void main(String[] args) { // O(nlogn)
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // Sorting
        int activity[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        // lambda function -> shortform
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activity[i][1] >= lastEnd) {
                // Activity Selected
                maxAct++;
                ans.add(activity[i][0]);
                lastEnd = activity[i][2];
            }
        }

        System.out.println("max Activity = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("Activity " + ans.get(i));
        }
        System.out.println();
    }
}