import org.junit.*;
import static org.junit.Assert.*;

public class LCATest {
    @Test
    public void testAncestor() {
        Node n = null;
        assertEquals(false, LCA.found(n, null));
        n = new Node(null, null, null, "root");
        assertEquals(true, LCA.found(n, n));
    }
}