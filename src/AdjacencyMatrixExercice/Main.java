package AdjacencyMatrixExercice;


//Create a Node class with a char value variable and a Graph class containing an int[][] matrix and an ArrayList<Node>.
//Implement these methods:
//- addNode(Node node)
//- addEdge(int src, int dst)
//- checkEdge(int src, int dst)
//- print()

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.addNode('A');
        graph.addNode('B');
        graph.addNode('C');

        graph.addEdge(0,1);
        graph.addEdge(1,2);

        graph.print();

        System.out.println(graph.countEdges());
    }

}
