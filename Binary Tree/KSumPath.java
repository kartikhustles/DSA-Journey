import java.util.*;

public class KSumPath {
    public static class Node {
        int data;
        KSumPath.Node left;
        KSumPath.Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static int count = 0;

    public static int sumK(Node root, int k) {
        ArrayList<Integer> path = new ArrayList<>();
        solve(root, k, path);
        return count;
    }

    public static void solve(Node root, int k, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        int sum = 0;
        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == k) {
                count++;
            }
        }

        solve(root.left, k, path);
        solve(root.right, k, path);

        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(sumK(root, 7));
    }
}
