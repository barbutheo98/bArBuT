public class LCA {

    public static Tree initializeTree (Node n) {
        Tree t = new Tree(n);
        return t;
    }

    public static Node commonAncestor (Node a, Node b) {
        if (a == null || b == null) {
            return null;
        }
        if (isAncestor (a, b)) {
            return a;
        }
        if (isAncestor(b, a)) {
            return b;
        }
        return commonAncestor(a.parent, b);
    }

    public static boolean isAncestor (Node ancestor, Node n) {
        //TODO(barbut): add implementation
        if (ancestor != null) {
            if (ancestor.leftKid == n || ancestor.rightKid == n || ancestor == n) {
                return true;
            }
            if (isAncestor(ancestor.leftKid, n) || isAncestor(ancestor.rightKid, n)) {
                return true;
            }
        }
        return false;
    }

}
