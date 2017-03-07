package io.fenske.crackinginterview.chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DirectedGraph {

    private Map<GraphNode, List<GraphNode>> adjacencyList = new HashMap<>();

    public void addNode(GraphNode a) {
        adjacencyList.put(a, new ArrayList<>());
    }

    public void addEdge(GraphNode fromNode, GraphNode toNode) {
        adjacencyList.get(fromNode).add(toNode);
    }

    public boolean hasRoute(GraphNode fromNode, GraphNode toNode) {
        fromNode.setVisited(true);
        for (GraphNode neighbour : adjacencyList.get(fromNode)) {
            if (!neighbour.isVisited() && (neighbour == toNode || hasRoute(neighbour, toNode))) {
                return true;
            }
        }
        return false;
    }
}
