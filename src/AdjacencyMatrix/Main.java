package AdjacencyMatrix;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        graph.print();

        graph.addVertice();
        graph.addEdge(5,0);
        graph.addEdge(5,2);
        graph.addEdge(5,3);

        System.out.println();
        System.out.println();
        graph.print();

        System.out.println();
        System.out.println();

        graph.removeVertex(5);
        graph.print();
    }
}
