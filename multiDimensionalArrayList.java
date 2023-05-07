import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class multiDimensionalArrayList {
    public static void main(String[] args) {

        // syntax
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);

        // Initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
    }
}
