import java.util.ArrayList;

public class Tree {
    Node root;
    Tree (Node root) {
        this.root = root;
    }

    public static Node addNode (ArrayList<Node> in, ArrayList<Node> out, int tag) {
        Node n = new Node(tag, in, out);
        int i; Node update;
        if (in != null) {
            for (i = 0; i < in.size(); i++) {
                update = n.in.get(i);
                if (update.out == null) {
                    update.out = new ArrayList<Node>();
                }
                update.out.add(n);
            }
        }
        if (out != null) {
            for (i = 0; i < out.size(); i++) {
                update = n.out.get(i);
                if (update.in == null) {
                    update.in = new ArrayList<Node>();
                }
                update.in.add(n);
            }
        }
        return n;
    }
}
