package AdjacencyMatrixExercice;

import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes ;
    int[][] matrix;
    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(char val){
        nodes.add(new Node(val));
    }

    public void addEdge(int src , int dst){
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src , int dst){
        return matrix[src][dst] == 1;
    }

    public void print(){
        System.out.print("  ");
        for(Node node : nodes){
            System.out.print(node.value + " ");
        }
        System.out.println();

        for (int i = 0 ; i < matrix.length ; i++){
            System.out.print(nodes.get(i).value + " ");
            for (int j = 0 ; j < matrix[i].length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    //this function counts the number of edges in a directional graph
    public int countEdges(){
        int count = 0;
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
