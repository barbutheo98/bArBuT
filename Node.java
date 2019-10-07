public class Node {
    Node leftKid;
    Node rightKid;
    Node parent;
    String tag;
    Node(Node parent, Node leftKid, Node rightKid, String tag) {
        this.parent = parent;
        this.leftKid = leftKid;
        this.rightKid = rightKid;
        this.tag = tag;
    }
}
