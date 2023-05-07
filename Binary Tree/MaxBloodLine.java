public class MaxBloodLine {
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

    public static void max(Node root, int maxs, int maxl, int cmaxs, int cmaxl) {
        if (root == null) {
            if (cmaxl > maxl) {
                maxl = cmaxl;
                maxs = cmaxs;
            } else if (cmaxl == maxl) {
                Math.max(cmaxs, maxs);
            }
            return;
        }
        cmaxs = cmaxs + root.data;
        max(root.left, maxs, maxl, cmaxs, cmaxl + 1);
        max(root.right, maxs, maxl, cmaxs, cmaxl + 1);
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(7);
        root.left.right = new Node(1);
        root.right.left = new Node(2);
        root.right.right = new Node(3);
        root.left.right.left = new Node(6);

        int len = 0;
        int max_len = 0;

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        max(root, maxSum, max_len, sum, len);
    }
}
