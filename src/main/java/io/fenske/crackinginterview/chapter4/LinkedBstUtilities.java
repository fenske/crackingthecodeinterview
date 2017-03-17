package io.fenske.crackinginterview.chapter4;

public class LinkedBstUtilities {
    public static LinkedTreeNode getNext(LinkedTreeNode node) {
        if (node == null) {
            throw new IllegalArgumentException("Argument cannot be null");
        }
        if (node.right != null) {
            return getSmallestChild(node.right);
        }
        return getParentOfSmallestParent(node);
    }

    private static LinkedTreeNode getSmallestChild(LinkedTreeNode node) {
        if (node.left == null) {
            return node;
        }
        return getSmallestChild(node.left);
    }

    private static LinkedTreeNode getParentOfSmallestParent(LinkedTreeNode node) {
        if (node.parent == null) {
            return null;
        }
        if (node.parent.left == node) {
            return node.parent;
        }
        return getParentOfSmallestParent(node.parent);
    }
}
