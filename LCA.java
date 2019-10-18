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
            return b;
        }
        if (isAncestor(b, a)) {
            return a;
        }
        if (a.out != null) {
            for (int i = 0; i < a.out.size(); i++) {
                Node retNode = commonAncestor(a.out.get(i), b);
                if (retNode != null)
                    return retNode;
            }
        }
        return null;
    }

    public static boolean isAncestor (Node ancestor, Node n) {

            if (ancestor == n) {
                return true;
            }
                if (ancestor.out != null) {
                    for (int i = 0; i < ancestor.out.size(); i++) {
                        if (isAncestor(ancestor.out.get(i), n)) {
                            return true;
                        }
                    }
                }

        return false;
    }

}
