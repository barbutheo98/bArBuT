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
    }
}