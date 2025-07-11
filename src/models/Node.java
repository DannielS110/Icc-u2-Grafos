package models;

import java.util.HashSet;
import java.util.Set;

public class Node {
    private int value;
    private Set<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public int getValue() {
        return value;
    }

    public void addNeighbor(Node node) {
        neighbors.add(node);
    }

    public Set<Node> getNeighbors() {
        return neighbors;
    }
}
