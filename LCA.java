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
        for (int i = 0; i < a.out.size(); i++) {
            Node retNode = commonAncestor(a.out.get(i), b);
            if (retNode != null)
                return retNode;
        }
        return null;
    }

    public static boolean isAncestor (Node ancestor, Node n) {
        if (ancestor != null) {
            if (ancestor == n) {
                return true;
            }
                for (int i = 0; i < ancestor.out.size(); i++) {
                    if (isAncestor(ancestor.out.get(i), n)) {
                        return true;
                    }
                }
        }
        return false;
    }

}
