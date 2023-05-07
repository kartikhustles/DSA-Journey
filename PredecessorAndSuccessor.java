import java.util.*;

public class PredecessorAndSuccessor {
    class BinaryTreeNode<T> {
        public T data;
        public BinaryTreeNode<T> left;
        public BinaryTreeNode<T> right;

        BinaryTreeNode(T data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // // Approach 1
    // public static void inorder(BinaryTreeNode<Integer> root, ArrayList<Integer>
    // inorderArray) {
    // if (root == null) {
    // return;
    // }

    // inorder(root.left, inorderArray);

    // inorderArray.add(root.data);

    // inorder(root.right, inorderArray);
    // }

    // public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer>
    // root, int key) {
    // // To store the inorder traversal of the BST.
    // ArrayList<Integer> inorderArray = new ArrayList<Integer>();

    // inorder(root, inorderArray);

    // int predecessor = -1, successor = -1;

    // for (int i = 0; i < inorderArray.size(); i++) {
    // if (inorderArray.get(i) == key) {
    // // If predecessor exist.
    // if (i - 1 >= 0) {
    // predecessor = inorderArray.get(i - 1);
    // }

    // // If successor exist.
    // if (i + 1 < inorderArray.size()) {
    // successor = inorderArray.get(i + 1);
    // }
    // break;
    // }
    // }

    // ArrayList<Integer> sol = new ArrayList<Integer>();
    // sol.add(predecessor);
    // sol.add(successor);
    // return sol;
    // }

    // Approach 2

    public static ArrayList<Integer> predecessorSuccessor(BinaryTreeNode<Integer> root, int key) {
        int predecessor = -1;
        int successor = -1;

        // Reach to the key.
        while (root.data != key) {
            if (key > root.data) {
                predecessor = root.data;
                root = root.right;
            } else {
                successor = root.data;
                root = root.left;
            }
        }

        BinaryTreeNode<Integer> rightSubtree = root.right;

        while (rightSubtree != null) {
            successor = rightSubtree.data;
            rightSubtree = rightSubtree.left;
        }

        BinaryTreeNode<Integer> leftSubtree = root.left;

        while (leftSubtree != null) {
            predecessor = leftSubtree.data;
            leftSubtree = leftSubtree.right;
        }

        ArrayList<Integer> sol = new ArrayList<Integer>();
        sol.add(predecessor);
        sol.add(successor);
        return sol;
    }
}
