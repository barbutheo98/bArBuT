public class LCA {

    public static Tree initializeTree (Node n) {
        Tree t = new Tree(n);
        return t;
    }

    public static Node commonAncestorDGA (Node a, Node b) {
        if (a == null || b == null) {
            return null;
        }
        if (isAncestorDGA (a, b)) {
            return b;
        }
        if (isAncestorDGA(b, a)) {
            return a;
        }
        if (a.out != null) {
            for (int i = 0; i < a.out.size(); i++) {
                Node retNode = commonAncestorDGA(a.out.get(i), b);
                if (retNode != null)
                    return retNode;
            }
        }
        return null;
    }

    public static boolean isAncestorDGA (Node ancestor, Node n) {

            if (ancestor == n) {
                return true;
            }
                if (ancestor.out != null) {
                    for (int i = 0; i < ancestor.out.size(); i++) {
                        if (isAncestorDGA(ancestor.out.get(i), n)) {
                            return true;
                        }
                    }
                }

        return false;
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
