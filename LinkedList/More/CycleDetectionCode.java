public class CycleDetectionCode {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
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
        CycleDetectionCode ll = new CycleDetectionCode();
        ll.insertAtFirst(1);
        ll.insertAtFirst(2);
        ll.insertAtFirst(5);
        ll.insertAtFirst(2);
        ll.insertAtFirst(1);

        System.out.println(isCycle());
    }
}
