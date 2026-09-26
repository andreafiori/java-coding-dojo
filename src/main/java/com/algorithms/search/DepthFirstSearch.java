package com.algorithms.search;

import java.util.LinkedList;

/**
 * epth First Search or DFS for a Graph
 * Wikipedia: https://en.wikipedia.org/wiki/Depth-first_search
 * Resource https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
 */
public class DepthFirstSearch
{
    /**
     * No. of vertices
     */
    private int V;

    /**
     * Array  of lists for Adjacency List Representation
     */
    private LinkedList<Integer>[] adj;

    private Integer[] results;

    /**
     * Constructor
     * @param v no of vertices
     */
    public DepthFirstSearch(Integer v)
    {
        this.V = v;
        this.adj = new LinkedList[v];
        for (int i=0; i<v; ++i) {
            this.adj[i] = new LinkedList();
        }
    }

    /**
     * Add an edge into the graph
     *
     * @param v no. of vertices
     * @param w edge to add
     */
    public void addEdge(int v, int w)
    {
        // Add w to vertices's list.
        adj[v].add(w);
    }

    /**
     * The function to do DFS traversal. It uses recursive DFSUtil()
     */
    public void DFS()
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean[] visited = new boolean[V];

        // Empty result list
        // this.setResults(new LinkedList<Integer>());

        // Call the recursive helper function to print DFS traversal
        // starting from all vertices one by one
        for (int i=0; i<V; ++i) {
            if (!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    /**
     * Recursive helper
     *
     * @param v No. of vertices
     * @param visited boolean
     */
    private void DFSUtil(int v, boolean[] visited)
    {
        // Mark the current node as visited and print it
        visited[v] = true;

        System.out.print(v+" "); // that's ugly!
        // TODO: add element to this.results.ap

        // Recur for all the vertices adjacent to this vertex
        for (int n : adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }
}
