public class LLbyKK {
    public Node head;
    public Node tail;
    public int size;

    public LLbyKK() {
        this.size = 0;
    }

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

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertAtFirst(val);
            return;
        }
        if (index == size) {
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public Node reverse() {
        Node cur = head;
        Node prev = null;
        while (cur != null) {
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Node find(int val) {
        Node node = head;
        while (node != null) {
            if (node.data == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public int deleteFirst() {
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.data;
        tail = get(size - 2);
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node first = get(index - 1);
        int val = first.next.data;
        Node second = first.next.next;
        first.next = second;
        size--;
        return val;
    }

    public int recSearch(int key) {
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
}
