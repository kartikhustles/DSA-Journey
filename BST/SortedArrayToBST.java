public class SortedArrayToBST {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node createBST(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    public static void main(String[] args) {
        int[] var = { 3, 5, 6, 8, 10, 11, 12 };
        Node root = createBST(var, 0, var.length - 1);
        inorder(root);
    }
}
