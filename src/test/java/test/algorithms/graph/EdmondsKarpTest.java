package test.algorithms.graph;

import com.algorithms.graph.EdmondsKarp;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mateusz on 27.02.17.
 */
public class EdmondsKarpTest {

    @Test
    public void Test1() {
        int A = 0, B = 1, C = 2, D = 3, E = 4, F = 5, G = 6;
        EdmondsKarp ek = new EdmondsKarp(7, 11);
        ek.addEdge(A, D, 3);
        ek.addEdge(D, F, 6);
        ek.addEdge(A, B, 3);
        ek.addEdge(E, B, 1);
        ek.addEdge(E, G, 1);
        ek.addEdge(F, G, 9);
        ek.addEdge(D, E, 2);
        ek.addEdge(B, C, 4);
        ek.addEdge(C, A, 3);
        ek.addEdge(C, D, 1);
        ek.addEdge(C, E, 2);

        assertEquals(5, ek.getMaxFlow(A, G));
    }

    @Test
    public void Test2() {
        EdmondsKarp ek = new EdmondsKarp(2, 1);
        ek.addEdge(1, 0, 10);

        assertEquals(0, ek.getMaxFlow(0, 1));
        assertEquals(10, ek.getMaxFlow(1, 0));
    }

    @Test
    public void Test3() {
        EdmondsKarp ek = new EdmondsKarp(4, 5);

        ek.addEdge(0, 1, 1000);
        ek.addEdge(0, 2, 1000);
        ek.addEdge(1, 3, 1000);
        ek.addEdge(2, 3, 1000);
        ek.addEdge(1, 2, 1);

        assertEquals(2000, ek.getMaxFlow(0, 3));
    }

    @Test
    public void Test4() {
        EdmondsKarp ek = new EdmondsKarp(6, 8);

        ek.addEdge(0, 1, 3);
        ek.addEdge(0, 3, 3);
        ek.addEdge(1, 3, 2);
        ek.addEdge(1, 2, 3);
        ek.addEdge(3, 4, 2);
        ek.addEdge(4, 5, 3);
        ek.addEdge(2, 4, 4);
        ek.addEdge(2, 5, 2);

        assertEquals(5, ek.getMaxFlow(0, 5));
    }
}
