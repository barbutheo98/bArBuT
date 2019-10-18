import java.util.ArrayList;

public class Node {
    Node leftKid;
    Node rightKid;
    Node parent;
    int tag;
    ArrayList<Node> out;
    Node(int tag) {
        this.tag = tag;
    }
    Node(int tag, ArrayList<Node> out) {
        this.tag = tag;
        this.out = out;
    }
}
