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
}
