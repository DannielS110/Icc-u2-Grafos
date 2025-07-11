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
        List<Node> sortedNeighbors = new ArrayList<>(node.getNeighbors());
        sortedNeighbors.sort((n1, n2) -> Integer.compare(n1.getValue(), n2.getValue()));

        for (Node neighbor : sortedNeighbors) {
            System.out.print(" -> " + neighbor.getValue());
        }
        System.out.println(); // Salto de línea al final de cada vértice
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
