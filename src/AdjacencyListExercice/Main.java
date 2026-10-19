package AdjacencyListExercice;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(new Node("ziyad"));
        graph.addNode(new Node("saad"));
        graph.addNode(new Node("isra"));
        graph.addNode(new Node("chaima"));
        graph.addNode(new Node("imad"));

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(3,4);
        graph.addEdge(4,3);

        graph.print();
    }
}
