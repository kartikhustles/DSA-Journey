import java.util.*;
import java.util.LinkedList;

public class LLbyKK {
    private Node head;
    private Node tail;
    
    public LLbyKK() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.val + " -> ");
                if (node.next != null) {
		            node = node.next;
		        }
            } while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val) {
        Node node = head;
        if (node == null) {
            return;
        }

        // if (head == tail && val == head.val){
        //     head = null;
        //     tail = null;
        //     return;
        // }

        if (head.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

        System.out.println();
    }
}