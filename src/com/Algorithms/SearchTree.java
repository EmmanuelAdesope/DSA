package com.Algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
This program searches for a node at any depth p in a time in the order of P
 */
public class SearchTree {
    public static void main(String[] args) {

        // The class is used to create a queue
        Deque<Integer> deque = new ArrayDeque<>();

        // the root node is added as first element.
        deque.add(0);



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
  }

 }