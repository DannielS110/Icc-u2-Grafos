import controller.Graph;
import java.util.HashSet;
import models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(":=========================");
        System.out.println("ICC U2 Grafos");
        System.out.println("Autor: Daniel Sanchez");
        System.out.println(":=========================");
        System.out.println("Creando grafo...\n");
        System.out.println("|");
        System.out.println("|");
        Graph graph = new Graph();

        Node node0 = graph.addNode(0);
        Node node1 = graph.addNode(1);
        Node node2 = graph.addNode(2);
        Node node3 = graph.addNode(3);
        Node node4 = graph.addNode(4);
        Node node5 = graph.addNode(5);
        Node node7 = graph.addNode(7);
        Node node8 = graph.addNode(8);
        Node node9 = graph.addNode(9);

        graph.addEdge(node0, node1);
        graph.addEdge(node0, node3);
        graph.addEdge(node0, node5);

        graph.addEdge(node1, node2);
        graph.addEdge(node1, node4);
        graph.addEdge(node1, node8);
        graph.addEdge(node9, node1);

        graph.addEdge(node2, node3);
        graph.addEdge(node3, node4);
        graph.addEdge(node3, node7);

        graph.addEdge(node7, node8);

        graph.printGraph();
    }
}