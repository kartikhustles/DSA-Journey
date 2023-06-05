import java.util.*;

public class ImpDeque {
    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();
        q.addFirst(1); // 1
        q.addFirst(2); // 2 1
        q.addLast(3); // 2 1 3
        q.addLast(4); // 2 1 3 4
        System.out.println(q);
        q.removeLast();
        System.out.println(q);

        System.out.println("First el = " + q.getFirst());
        System.out.println("First el = " + q.getLast());
    }
}
