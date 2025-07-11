package controller;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import models.Node;
import java.util.ArrayList;
public class Graph {
    private Set<Node> nodes;

    public Graph(){
        nodes = new HashSet<>();
    }

    public Node addNode(int value){
        Node node = new Node(value);
        nodes.add(node);
        return node;
    }
   
    public Node addNode(Node node){
        nodes.add(node);
        return node;
    }
   
  public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }
    public void addEdgeUni(Node src, Node dest){
        src.addNeighbor(dest);
    }

public void printGraph() {
    List<Node> sortedNodes = new ArrayList<>(nodes);
    sortedNodes.sort((n1, n2) -> Integer.compare(n1.getValue(), n2.getValue())); 

    for (Node node : sortedNodes) {
        System.out.print("Vertex " + node.getValue() + ":");
        Set<Node> vecinos = node.getNeighbors();

        if (vecinos != null && !vecinos.isEmpty()) {
            List<Node> sortedVecinos = new ArrayList<>(vecinos);
            sortedVecinos.sort((n1, n2) -> Integer.compare(n1.getValue(), n2.getValue()));

            for (Node vecino : sortedVecinos) {
                System.out.print(" -> " + vecino.getValue());
            }
        }
        System.out.println();
    }
}

    

    public void getDFS(Node startNode){

    }

    private void getDFSUtil(Node node, Boolean[] visited){
    }

    public void getBFS(Node startNode){

    }

    public int[][] getAdjacencyMatrix(){
        return null;
    }

    public void printAdjacencyMatrix(){
    }
}
