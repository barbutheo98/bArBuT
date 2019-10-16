import java.util.ArrayList;

public class Node {
    Node leftKid;
    Node rightKid;
    Node parent;
    int tag;
    ArrayList<Node> in;
    ArrayList<Node> out;
    Node(int tag) {
        this.tag = tag;
    }
}
