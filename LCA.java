public class LCA {

    public static Tree initializeTree (Node n) {
        Tree t = new Tree(n);
        return t;
    }

    public static Node commonAncestor (Node a, Node b) {
        if (isAncestor (a, b)) {
            return a;
        }
        if (isAncestor(b, a)) {
            return b;
        }
        //TODO(barbut): add implementation
        return null;
    }

    public static boolean isAncestor (Node ancestor, Node n) {
        //TODO(barbut): add implementation
        return false;
    }

}
