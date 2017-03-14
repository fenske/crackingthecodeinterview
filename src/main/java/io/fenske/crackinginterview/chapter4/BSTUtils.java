package io.fenske.crackinginterview.chapter4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BSTUtils {
    public static Map<Integer, List<BST>> buildLevelLists(BST root) {
        if (root == null) {
            throw new IllegalArgumentException("Input BST cannot be null.");
        }
        LinkedList<Pair> queue = new LinkedList<>();
        queue.addLast(new Pair(root, 0));
        Map<Integer, List<BST>> levelLists = new HashMap<>();
        while (!queue.isEmpty()) {
            Pair pair = queue.removeFirst();
            if (!levelLists.containsKey(pair.level)) {
                levelLists.put(pair.level, new LinkedList<>());
            }
            levelLists.get(pair.level).add(pair.node);
            if (pair.node.left != null) {
                queue.addLast(new Pair(pair.node.left, pair.level + 1));
            }
            if (pair.node.right != null) {
                queue.addLast(new Pair(pair.node.right, pair.level + 1));
            }
        }
        return levelLists;
    }

    public static class Pair {
        public BST node;
        public int level;

        public Pair(BST node, int level) {
            this.node = node;
            this.level = level;
        }
    }
}
