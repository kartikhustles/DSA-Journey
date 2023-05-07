public class LowestCommonAncestor {
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

    // // Approach 1
    // public static int lca(Node root, int n1, int n2) {
    // ArrayList<Node> path1 = new ArrayList<>();
    // ArrayList<Node> path2 = new ArrayList<>();

    // getPath(root, n1, path1);
    // getPath(root, n2, path2);

    // // last common ancestor
    // int i = 0;
    // for (; i < path1.size() && i < path2.size(); i++) {
    // if (path1.get(i) != path2.get(i)) {
    // break;
    // }
    // }

    // // last equal node -> i-1th
    // Node lca = path1.get(i - 1);
    // return lca.data;
    // }

    // public static boolean getPath(Node root, int n, ArrayList<Node> path) {
    // if (root == null) {
    // return false;
    // }
    // path.add(root);
    // if (root.data == n) {
    // return true;
    // }
    // boolean foundleft = getPath(root.left, n, path);
    // boolean foundright = getPath(root.right, n, path);

    // if (foundright || foundleft) {
    // return true;
    // }

    // path.remove(path.size() - 1);
    // return false;
    // }

    // Approach 2
    public static Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftlca = lca(root.left, n1, n2);
        Node rightlca = lca(root.right, n1, n2);

        // leftLCA=val rightLCA=null
        if (rightlca == null) {
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(lca(root, 7, 6));
    }
}
