import java.util.ArrayList;

public class Node {
    int tag;
    ArrayList<Node> out;
    Node(int tag, ArrayList<Node> out) {
        this.tag = tag;
        this.out = out;
    }
}
