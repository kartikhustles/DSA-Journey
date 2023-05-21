public class DeleteNthFromEnd {
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

    public void deleteNthNode(int n) {

        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // delete first
            return;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
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

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        DeleteNthFromEnd ll = new DeleteNthFromEnd();
        ll.insertAtFirst(24);
        ll.insertAtFirst(2);
        ll.insertAtFirst(4);
        ll.insertAtFirst(12);
        ll.insertAtFirst(46);
        ll.insertAtFirst(14);

        ll.display();
        ll.deleteNthNode(24);
        ll.display();

    }
}
