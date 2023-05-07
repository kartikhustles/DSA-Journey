import java.util.*;
import java.util.LinkedList;

public class LLbyKK{
    private Node head;

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node prev, Node next){
            this.val = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void insertAtLast(int val){
        Node temp = new Node(val);
        Node node = head;

        if (head == null) {
            temp.prev = null;
            temp.next = null;
            head = temp;
            return;
        }
        while (node.next != null) {
            node = node.next;
        }
        node.next = temp;
        temp.prev = node;
        temp.next = null;
    }

    public void insertAfter(int after, int val){
        Node p  = find(after);

        if (p == null){
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int val){
        Node node = head;
        while (node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        head.prev = null;
        return value;
    }

    public int deleteLast(){
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.prev.next = null;
        int value = tail.val;
        return value;
    }

    public int deletePar(int value){
        Node temp = head;
        while (temp.next != null) {
            if (temp.val == value) {
                break;
            }
            temp = temp.next;
        }
        if (temp.prev == null) {
            head = head.next;
            head.prev = null;
        }
        else {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        return temp.val;
    }

    public void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
        System.out.println();
    }

    public void displayReverse(){
        Node temp = head;
        Node tail = null;
        while (temp != null) {
            tail = temp;
            temp = temp.next;
        }
        while (tail != null) {
            System.out.print(tail.val+ " -> ");
            tail = tail.prev;
        }
        System.out.println("START");
        System.out.println();
    }

    public void displayInBoth(){
        System.out.println("Print in Order");
        System.out.println();

        Node node = head;

        Node last = null;

        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }

        System.out.println("END");
        System.out.println();

        System.out.println("Print in Reverse");
        System.out.println();

        while (last != null) {
            System.out.print(last.val+ " -> ");
            last = last.prev;
        }
        
        System.out.println("START");
    }
}