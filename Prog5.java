/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog5;

/*
 * My words and actions will reflect Academic Integrity.
 * I will not cheat or lie or steal in academic matters.
 * I will promote integrity in the UNCG community.
 * Devin Holcomb     November 17, 2022
 */
/**
 *
 * @author Devin
 */
public class Prog5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Graph<Integer> oneA = new Graph<Integer>(6);

        oneA.addEdge(0, 1);
        oneA.addEdge(0, 2);
        oneA.addEdge(1, 2);
        oneA.addEdge(1, 3);
        oneA.addEdge(2, 3);
        oneA.addEdge(3, 4);
        oneA.addEdge(4, 1);
        oneA.addEdge(4, 0);
        oneA.addEdge(4, 5);

        System.out.println("Adjacency List for the Graph 1: \n");
        oneA.print(6);
        System.out.println();

        System.out.println("BFS Traversal: ");
        oneA.printBFS(3);
        System.out.println();
        System.out.println();

        Graph<Integer> TwoA = new Graph<>(6);

        TwoA.addEdge(5, 0);
        TwoA.addEdge(5, 2);
        TwoA.addEdge(2, 3);
        TwoA.addEdge(3, 1);
        TwoA.addEdge(4, 1);
        TwoA.addEdge(4, 0);

        System.out.println("Adjacency List for Graph 2: \n");

        TwoA.print(6);
        System.out.println();

        System.out.println("A topological sort: ");

        TwoA.topoSort();

    }
}
