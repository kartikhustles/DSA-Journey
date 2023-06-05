import java.util.*;

public class QueueUsingDeque {
    static class Queue {
        Deque<Integer> q = new LinkedList<>();

        public void add(int data) {
            q.addLast(data);
        }

        public int remove() {
            return q.removeFirst();
        }

        public int peek() {
            return q.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek is " + q.peek());
        System.out.println("Remove is " + q.remove());
        System.out.println("Remove is " + q.remove());
        System.out.println("Remove is " + q.remove());
    }
}
