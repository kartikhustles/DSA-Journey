public class PrintInRange {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static void Print(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1 && root.data <= k2) {
            Print(root.left, k1, k2);
            System.out.print(root.data + " ");
            Print(root.right, k1, k2);
        }

        if (root.data > k2) {
            Print(root.left, k1, k2);
        }

        if (root.data < k1) {
            Print(root.right, k1, k2);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        Print(root, 5, 12);

    }
}
