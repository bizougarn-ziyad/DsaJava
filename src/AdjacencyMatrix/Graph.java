package AdjacencyMatrix;

public class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    Graph(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int src , int dst ){
        adjMatrix[src][dst] = 1 ;
        adjMatrix[dst][src] = 1 ;
    }
    public void removeEdge(int src , int dst){
        adjMatrix[src][dst] = 0 ;
        adjMatrix[dst][src] = 0 ;
    }

    public void addVertice(){
        int[][] newAdjMatrix = new int[numVertices + 1][numVertices + 1];

        for(int i = 0 ; i < numVertices ; i++){
            for(int j = 0 ; j < numVertices ; j++ ){
                newAdjMatrix[i][j] = adjMatrix[i][j];
            }
        }

        adjMatrix = newAdjMatrix;
        numVertices++;
    }

    public void removeVertex(int v){
        int[][] newAdjMatrix = new int[numVertices - 1][numVertices - 1];
        for(int i = 0 ; i < numVertices ; i++){
            for(int j = 0 ; j < numVertices ; j++){
                if(i != v && j != v){
                    newAdjMatrix[i][j] = adjMatrix[i][j];
                }
            }
        }
        adjMatrix = newAdjMatrix;
        numVertices--;
    }

    public void print(){
        for(int i = 0 ; i < numVertices ; i++){
            for(int j = 0 ; j < numVertices ; j++){
                System.out.print(adjMatrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
