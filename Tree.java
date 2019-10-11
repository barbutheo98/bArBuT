public class Tree {
    Node root;
    Tree (Node root) {
        this.root = root;
    }

    public boolean findNode (Node n, Node root) {
        if (root == null) {
            return false;
        }
        else if (n == root) {
            return true;
        }
        if (findNode (n, root.leftKid)) {
            return true;
        }
        return findNode (n, root.rightKid);

    }
}
