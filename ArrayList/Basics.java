import java.util.*;

public class Basics {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(35);
        list.add(49);
        list.add(69);
        list.add(23);
        list.add(22);
        list.add(11);
        list.add(99);
        list.add(35);
        list.add(37);
        list.add(72);
        list.add(353);
        list.add(356);
        list.add(24);
        list.add(90);

        System.out.println(list); // printing list

        System.out.println(list.contains(22)); // Check

        System.out.println(list.contains(696)); // Check

        list.set(0, 99); // replace
        System.out.println(list); // printing modified list

        list.remove(2); // remove
        System.out.println(list); // printing modified list

        // for (int i = 0; i < 5; i++) {
        // list.add(sc.nextInt()); // adding into the list
        // }

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // get item at any index
        }

        System.out.println(list); // Printing the whole list

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);

    }
}