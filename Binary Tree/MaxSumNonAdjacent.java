// https://practice.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1

public class MaxSumNonAdjacent {
    // static class Node {
    // int data;
    // Node right;
    // Node left;

    // Node(int data) {
    // this.data = data;
    // this.right = null;
    // this.left = null;
    // }
    // }

    // static int eSum;
    // static int oSum;

    // public static int getMaxSum(Node root) {
    // eSum = 0;
    // oSum = 0;
    // int level = 1;
    // helper(root, level, eSum, oSum);
    // return Math.max(eSum, oSum);
    // }

    // public static void helper(Node root, int level, int esum, int osum) {
    // if (root == null) {
    // return;
    // }
    // if (level % 2 == 0) {
    // esum += root.data;
    // } else {
    // osum += root.data;
    // }
    // helper(root.left, level + 1, esum, osum);
    // helper(root.right, level + 1, esum, osum);
    // }

    // public static void main(String[] args) {
    // Node root = new Node(1);
    // root.left = new Node(2);
    // root.right = new Node(3);
    // root.left.left = new Node(4);
    // root.left.right = new Node(5);
    // root.right.left = new Node(6);
    // root.right.right = new Node(7);

    // System.out.println(getMaxSum(root));
    // }

    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class Pair {
        int first;
        int second;

        Pair(int val1, int val2) {
            this.first = val1;
            this.second = val2;
        }
    }

    public static int getMaxSum(Node root) {
        Pair res = maxSumHelper(root);
        return Math.max(res.first, res.second);
    }

    public static Pair maxSumHelper(Node root) {
        if (root == null) {
            Pair sum = new Pair(0, 0);
            return sum;
        }
        Pair sum1 = maxSumHelper(root.left);
        Pair sum2 = maxSumHelper(root.right);
        Pair sum = new Pair(0, 0);
        sum.first = root.data + sum1.second + sum2.second;
        sum.second = Math.max(sum1.first, sum1.second) + Math.max(sum2.first, sum2.second);
        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(getMaxSum(root));
    }
}