import org.junit.*;
import static org.junit.Assert.*;

public class LCATest {

    @Test
    public void createTree(){
        Tree expectedTree = new Tree(null);
        Tree tree = LCA.initializeTree(null);
        assertEquals(expectedTree.root, tree.root);
        Node a = new Node (1);
        tree = LCA.initializeTree(a);
        Node b = new Node (2);
        Node c = new Node (3);
        tree.addNode(b, a, true);
        tree.addNode(c, a, false);
        assertEquals(a.leftKid, tree.root.leftKid);
        assertEquals(a.rightKid, tree.root.rightKid);
    }

    @Test
    public void testAncestor() {
        Node a = null;
        Node b = null;
        assertEquals(null, LCA.commonAncestor(a, b));
        a = new Node (1);
        b = new Node (2);
        Tree t = LCA.initializeTree(a);
        t.addNode(b, a, true);
        Node c = new Node (3); t.addNode (c, a, false);
        Node d = new Node (4); t.addNode (d, b, true);
        Node e = new Node (5); t.addNode (e, c, true);
        Node f = new Node (6); t.addNode (f, d, true);
        Node g = new Node (7); t.addNode (g, e, true);
        Node h = new Node (8); t.addNode (h, e, false);
        Node i = new Node (9); t.addNode (i, g, false);
        Node j = new Node (10); t.addNode (j, i, true);
        assertEquals (a, LCA.commonAncestor(a, b));
        assertEquals (a, LCA.commonAncestor(b, a));
        assertEquals (a, LCA.commonAncestor(a, a));
        assertEquals (e, LCA.commonAncestor(h, j));
        //case with two nodes
        //default case
    }
}