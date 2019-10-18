import org.junit.*;

import java.util.Arrays;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LCATest {

    @Test
    public void testDGA() {
        Node a = new Node(1, null);
        Tree t = LCA.initializeTree(a);
        assertEquals(a, LCA.commonAncestor(a, a));
        ArrayList<Node> l = new ArrayList<Node>();
        l.add(a);
        Node b = t.addNode(l, 2);
        assertEquals(a, LCA.commonAncestor(a, b));
        l = new ArrayList<Node>();
        l.add(b);
        Node c = t.addNode(l,3);
        l = new ArrayList<Node>();
        l.add(c);
        Node d = t.addNode(l,4);
        l = new ArrayList<Node>();
        l.add(b);
        Node e = t.addNode (l,5);
        l = new ArrayList<Node>();
        l.add(e);
        Node f = t.addNode (l,6);
        l = new ArrayList<Node>();
        l.add(d); l.add(f);
        Node g = t.addNode(l,7);
        assertEquals(a, LCA.commonAncestor(a, g));
    }
}