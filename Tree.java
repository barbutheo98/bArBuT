public class Tree {
    Node root;
    Tree (Node root) {
        this.root = root;
    }

    public static void addNode (Node n, Node parent, boolean isLeft) {
        if (n != null) {
            n.parent = parent;
            if (parent != null) {
                if (isLeft)
                    parent.leftKid = n;
                else parent.rightKid = n;
            }
        }
    }

}
