public class BuildBST {
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

    public static Node insert(Node root, int var) {
        if (root == null) {
            root = new Node(var);
            return root;
        }
        if (root.data > var) {
            root.left = insert(root.left, var);
        } else {
            root.right = insert(root.right, var);
        }

        return root;
    }

    public static Node deletee(Node root, int val) {
        if (root.data < val) {
            root.right = deletee(root.right, val);
        } else if (root.data > val) {
            root.left = deletee(root.left, val);
        } else {
            // voila
            // case 1 - leafnode
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deletee(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] var = { 5, 1, 3, 4, 2, 7, 6, 9, 0 };
        Node root = null;

        for (int i = 0; i < var.length; i++) {
            root = insert(root, var[i]);
        }

        inorder(root);
        System.out.println();

        deletee(root, 4);
        inorder(root);
    }
}
