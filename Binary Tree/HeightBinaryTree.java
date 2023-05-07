public class HeightBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int Tsum(Node root) {
        if (root == null) {
            return 0;
        }

        int lsum = Tsum(root.left);
        int rsum = Tsum(root.right);
        return lsum + rsum + root.data;
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    // O(n^2)
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int rheight = height(root.right);
        int lheight = height(root.left);
        int rdiameter = diameter(root.right);
        int ldiameter = diameter(root.left);

        return Math.max(rheight + lheight + 1, Math.max(rdiameter, ldiameter));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // System.out.println(height(root));
        // System.out.println(count(root));
        System.out.println(Tsum(root));
        // System.out.println(diameter(root));
    }
}
