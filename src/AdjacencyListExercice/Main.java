package AdjacencyListExercice;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(2,1);

        System.out.println(graph.checkEdge(1,2));
        System.out.println(graph.checkEdge(0,1));

        graph.print();
    }
}
