package com.Algorithms;

import java.util.*;

/*
This program searches for a node at a depth P(starting at the root) at in a time in the order of P

 */
public class SearchGraph {

    public static void main(String[] args) {

            // List of graph edges as per the above diagram
            List<Edge> edges = Arrays.asList(
                    new Edge(1, 2), new Edge(1, 3), new Edge(1, 4), new Edge(2, 5),
                    new Edge(2, 6), new Edge(5, 9), new Edge(5, 10), new Edge(4, 7),
                    new Edge(4, 8), new Edge(7, 11), new Edge(7, 12)
                    // vertex 0, 13, and 14 are single nodes
            );

            // total number of nodes in the graph (labelled from 0 to 14)
            int n = 15;
            int key = 7;
            // build a graph from the given edges
            Graph graph = new Graph(edges, n);

            // to keep track of whether a vertex is discovered or not
            boolean[] discovered = new boolean[n];

            // Perform BFS traversal from all undiscovered nodes to
            // cover all connected components of a graph
            for (int i = 0; i < n; i++)
            {
               // if node is found, stop the loop
                if (i == key){
                  break;
                }
                if (!discovered[i])
                {
                    // start BFS traversal from vertex `i`
                    BFS(graph, i, discovered,key);
                }
            }
        }



    // Perform BFS on the graph starting from vertex `v`
    public static void BFS(Graph graph, int v, boolean[] discovered, int key) {
        // create a queue for doing BFS
        Deque<Integer> deque = new ArrayDeque<>();


        // mark the source vertex as discovered
        discovered[v] = true;

        // enqueue source vertex
        deque.add(v);

        // loop till queue is empty
        while (!deque.isEmpty()) {
            // dequeue front node
            v = deque.poll();

            // do for every edge (v, u)
            for (int u : graph.adjList.get(v)) {
                if (u == key) {
                    System.out.println(key + " is present");
                    return;

                }

                if (!discovered[u]) {
                    // mark it as discovered and enqueue it
                    discovered[u] = true;
                    deque.add(u);
                }
            }
        }

    }

}

// Class to store a graph edge
class Edge {
int source, dest ;

public Edge(int source, int dest){
    this.source = source ;
    this.dest = dest ;
    }

 }

 class Graph {

    ArrayList<ArrayList<Integer>>  adjList  = new ArrayList<>();

    /*The graph Constructor. n is the number of nodes or vertices.
     it constructs the graph from the list of edges.
     */
  Graph(List<Edge> edges, int n)
  {
      for (int i = 0; i < n; i++){

      adjList.add(new ArrayList<>());
      }
      for (Edge edge: edges )
      {
          int src = edge.source;
          int dest = edge.dest;

          adjList.get(src).add(dest);
          adjList.get(dest).add(src);
      }

  }

 }