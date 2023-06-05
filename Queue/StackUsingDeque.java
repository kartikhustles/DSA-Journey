import java.util.*;

public class StackUsingDeque {
    static class Stack {
        Deque<Integer> q = new LinkedList<>();

        public void push(int data) {
            q.addLast(data);
        }

        public int pop() {
            return q.removeLast();
        }

        public int peek() {
            return q.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek = " + s.peek());
        System.out.println("pop = " + s.pop());
        System.out.println("pop = " + s.pop());
        System.out.println("pop = " + s.pop());
    }
}
