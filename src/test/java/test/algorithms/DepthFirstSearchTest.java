package test.algorithms;

import org.junit.Test;
import com.algorithms.search.DepthFirstSearch;

public class DepthFirstSearchTest
{
    @Test
    public void testMainUsage()
    {
        DepthFirstSearch graph = new DepthFirstSearch(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        // TODO let the method returns a value or use a Singleton class to do it
        graph.DFS();
    }
}
