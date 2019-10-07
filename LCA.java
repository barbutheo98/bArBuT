public class LCA {
    public static void main(String[] args) {

    }

    public static Boolean isAncestor(Node n, Node ancestor) {
        if (found (ancestor, n)) {
            return true;
        }
        return false;
    }

    public static Boolean found (Node root, Node n) {
        if (root == null) {
            return false;
        }
        else if (root == n) {
            return true;
        }
        if (found (root.leftKid, n) || found (root.rightKid, n)) {
            return true;
        }
        return false;
    }
}
