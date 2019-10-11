import org.junit.*;
import static org.junit.Assert.*;

public class LCATest {
    @Test
    public void createTree(){
        //test to check if binary tree is correctly initialised
    }

    @Test
    public void testNode() {
        //test to check if node is correctly initialised.
    }

    @Test
    public void testAncestor() {
        Node n = null;
        assertEquals(false, LCA.found(n, null));
        n = new Node(null, null, null, "root");
        assertEquals(true, LCA.found(n, n));
        //test to check if ancestor of node with parents
    }
}
