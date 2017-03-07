package io.fenske.crackinginterview.chapter4;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class GraphUtilitiesTest {

    @Test
    void shouldIdentifyIfHasRoute() {
        GraphNode a = new GraphNode();
        GraphNode b = new GraphNode();
        GraphNode c = new GraphNode();
        GraphNode d = new GraphNode();
        DirectedGraph graph = new DirectedGraph();
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        graph.addEdge(a, b);
        graph.addEdge(b, c);
        graph.addEdge(b, d);
        graph.addEdge(c, a);

        assertTrue(graph.hasRoute(a, d));
        assertFalse(graph.hasRoute(c, d));
    }
}
