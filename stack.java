import java.util.*;

public class stack {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();

        // stack.push(22);
        // stack.push(24);
        // stack.push(56);
        // stack.push(88);
        // stack.push(99);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.size());
        
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // // System.out.println(stack.pop()); // Error
        
        // System.out.println(stack.isEmpty());
        // System.out.println(stack.size());



        // Queue<Integer> queue = new LinkedList<>();

        // queue.add(3);
        // queue.add(6);
        // queue.add(5);
        // queue.add(7);
        // queue.add(9);

        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());
        // System.out.println(queue.peek());
        // queue.remove();
        // System.out.println(queue.peek());


        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(89);
        deque.add(99);
        deque.addLast(100);
        // System.out.println(deque.pop());
        // System.out.println(deque.pop());
        // System.out.println(deque.pop());
        deque.removeFirst();
        deque.addFirst(1);
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
    }
}
