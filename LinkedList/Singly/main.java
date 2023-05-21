import java.util.*;

public class main {
    public static void main(String[] args) {
        LLbyKK list = new LLbyKK();
        list.insertAtFirst(3);
        list.insertAtLast(7);
        list.insertAtFirst(10);
        list.insertAtLast(15);
        list.insert(20, 2);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(1));
        list.display();

        // System.out.println(list.find(7));

        list.insertAtFirst(5);
        list.insertAtLast(1);
        list.insertAtFirst(10);

        list.display();
        list.reverse();
        list.display();
    }

    public static int recSearch(int key) {
        Node temp = head;
        return helper(temp, key, 0);
    }

    private static int helper(Node temp, int key, int idx) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return idx;
        }

        return helper(temp.next, key, idx + 1);
    }
}