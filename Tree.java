import java.util.ArrayList;

public class Tree {
    Node root;
    Tree (Node root) {
        this.root = root;
    }

    public static Node addNode (ArrayList<Node> out, int tag) {
        Node n = new Node(tag, out);
        return n;
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
