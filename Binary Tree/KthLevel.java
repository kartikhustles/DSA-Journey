import java.util.*;

public class KthLevel {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // // Approach 1
    // public static void Levelorder(Node root, int k) {
    // Queue<Node> q = new LinkedList<>();
    // q.add(root);
    // q.add(null);
    // int temp = 1;

    // while (!q.isEmpty()) {
    // Node currNode = q.remove();
    // if (currNode == null) {
    // temp++;
    // if (q.isEmpty()) {
    // break;
    // } else {
    // q.add(null);
    // }
    // } else {
    // if (temp == k) {
    // System.out.print(currNode.data + " ");
    // }
    // if (currNode.left != null) {
    // q.add(currNode.left);
    // }
    // if (currNode.right != null) {
    // q.add(currNode.right);
    // }
    // }
    // }
    // }

    // public static void main(String[] args) {
    // Node root = new Node(1);
    // root.left = new Node(2);
    // root.right = new Node(3);
    // root.left.left = new Node(4);
    // root.left.right = new Node(5);
    // root.right.right = new Node(6);

    // Levelorder(root, 3);
    // }

    // Approach 2
    public static void printelements(Node root, int k, int temp) {
        if (root == null) {
            return;
        }
        if (k == temp) {
            System.out.print(root.data + " ");
            return;
        }
        printelements(root.left, k, temp + 1);
        printelements(root.right, k, temp + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        printelements(root, 3, 1);
    }
}
