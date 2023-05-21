import java.util.*;

public class JavaImplementation {
    public static void main(String[] args) {
        // create
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(0);
        ll.addFirst(3);

        // 3->0->2->1
        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}