package AdjacencyListExercice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> alist;
    Graph(){
        alist = new ArrayList<>();
    }

    public void addNode(Node node){
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src , int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dest = alist.get(dst).getFirst();
        currentList.add(dest);
    }

    public boolean checkEdge(int src , int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dest = alist.get(dst).getFirst();
        for(Node node : currentList){
            if(node == dest){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(LinkedList<Node> currentList : alist){
            for(Node node : currentList){
                System.out.print(node.name + " -> ");
            }
            System.out.println();
        }
    }


}
