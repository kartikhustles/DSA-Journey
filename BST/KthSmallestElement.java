public class KthSmallestElement {
    public static class Node {
        int val;
        Node left = null, right = null, parent = null;

        Node(int val) {
            this.val = val;
        }
    }

    public static int i = 0;

    public static void KthSmallest(Node root, int k) {
        if (root == null) {
            return;
        }

        KthSmallest(root.left, k);
        i++;
        if (i == k) {
            System.out.println(root.val);
        }
        KthSmallest(root.right, k);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        KthSmallest(root, 6);
    }
}