package prog5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Devin
 * 
 */
public class Graph<E> {

    public int vertices;
    public LinkedList<Integer> adjList[];
/**
 * Default
 */
    Graph() {
    }
/**
 * Creates a graph with an amount of nodes/vertices
 * @param nodes 
 */
    Graph(int nodes) {
        vertices = nodes;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjList[i] = new LinkedList();
        }

    }
/**
 * adds edges to a graph with source and destination value
 * @param src
 * @param dest 
 */
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }
/**
 * prints BFS traversal of the graph given the source
 * @param src 
 */
    public void printBFS(int src) {

        boolean visited[] = new boolean[vertices];

        LinkedList<Integer> queue = new LinkedList<>();

        visited[src] = true;
        queue.add(src);

        while (!queue.isEmpty()) {

            src = queue.poll();
            System.out.print(src + " ");

            Iterator<Integer> i = adjList[src].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }
/**
 * Prints out the graph in adjacency list
 * @param vertices 
 */

/**
 * Helper method for topological sort for recursive call, iterates through vertices
 * @param vertices
 * @param visited
 * @param sorted 
 */
    public void topoSortCheck(int vertices, boolean visited[], Stack sorted) {

        visited[vertices] = true;

        Iterator<Integer> i = adjList[vertices].iterator();
        int current;

        while (i.hasNext()) {
            current = i.next();

            if (!visited[current]) {
                topoSortCheck(current, visited, sorted);
            }

        }

        sorted.add(vertices);
    }
/**
 * sorts the graph and prints out the vertices in topological order
 */
    public void topoSort() {

        Stack sorted = new Stack<>();

        boolean visited[] = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                topoSortCheck(i, visited, sorted);
            }
        }

        while (!sorted.isEmpty()) {

            vertices = (int) sorted.pop();
            System.out.print(vertices + " ");

        }
    }
        public void print(int vertices) {

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int x : adjList[i]) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    

}
