public class Search {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean SearchBST(Node root, int val) {
        if (root == null) {
            return false;
        }
        if (root.data == val) {
            return true;
        }
        if (root.data > val) {
            return SearchBST(root.left, val);
        } else {
            return SearchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        System.out.println(SearchBST(root, 6));
    }
}
