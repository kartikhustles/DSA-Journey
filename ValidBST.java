public class ValidBST {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean IsValidBST(Node root, int max, int min) {
        if (root == null) {
            return true;
        }
        if (root.data > max || root.data < min) {
            return false;
        }
        return IsValidBST(root.left, root.data, min) && IsValidBST(root.right, max, root.data);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(12);
        root.right.right.right = new Node(14);
        root.left.left.left = new Node(20);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println(IsValidBST(root, max, min));
    }
}
