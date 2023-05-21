public class LLPalindrome {
    public Node head;
    public Node tail;
    public int size;

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public Node findMin(Node head) {
        // Slow Fast Concept

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midNode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next != null) {
            return true;
        }

        // step 1 - find mid
        Node midNode = findMin(head);

        // step 2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step 3 - check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public static void main(String[] args) {
        LLPalindrome ll = new LLPalindrome();

        // ll.insertAtFirst(2);
        // ll.insertAtFirst(4);
        // ll.insertAtFirst(6);
        // ll.insertAtFirst(10);
        // ll.insertAtFirst(19);

        // System.out.println(ll.checkPalindrome());

        ll.insertAtFirst(1);
        ll.insertAtFirst(2);
        ll.insertAtFirst(5);
        ll.insertAtFirst(2);
        ll.insertAtFirst(1);

        System.out.println(ll.checkPalindrome());
    }
}
