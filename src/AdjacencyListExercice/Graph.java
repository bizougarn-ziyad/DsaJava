package AdjacencyListExercice;

import java.util.ArrayList;

public class Graph {

    ArrayList<ArrayList<Node>> alist;
    Graph(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        ArrayList<Node> currentList = new ArrayList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src , int dst){
        ArrayList<Node> currentList = alist.get(src);
        Node destinationNode = alist.get(dst).getFirst();
        currentList.add(destinationNode);
    }

    public boolean checkEdge(int src , int dst){
        ArrayList<Node> currentList = alist.get(src);
        Node destinationNode = alist.get(dst).getFirst();
        return currentList.contains(destinationNode);
    }

    public void print(){
        for(ArrayList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.val + " -> ");
            }
            System.out.println();
        }
    }

}
