public class Mirroring {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void Mirror(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        Mirror(root.left);
        Mirror(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right = new Node(10);
        root.right.right = new Node(12);
        root.right.right.right = new Node(14);

        Inorder(root);
        System.out.println();

        Mirror(root);

        Inorder(root);
    }
}
