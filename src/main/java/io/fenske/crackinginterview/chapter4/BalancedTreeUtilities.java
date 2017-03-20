package io.fenske.crackinginterview.chapter4;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class BalancedTreeUtilities {
    public static boolean isBalanced(TreeNode root) {
        return findMaxDepth(root) - findMinDepth(root) <= 1;
    }

    private static int findMinDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return min(findMinDepth(node.left), findMinDepth(node.right)) + 1;
    }

    private static int findMaxDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return max(findMaxDepth(node.left), findMaxDepth(node.right)) + 1;
    }

    public static TreeNode findLowestCommonAncestor(TreeNode root, TreeNode x, TreeNode y) {
        if (isCommonAncestor(root.left, x, y)) {
            return findLowestCommonAncestor(root.left, x, y);
        } else if (isCommonAncestor(root.right, x, y)) {
            return findLowestCommonAncestor(root.right, x, y);
        } else if (isCommonAncestor(root, x, y)) {
            return root;
        }
        return null;
    }

    private static boolean isCommonAncestor(TreeNode root, TreeNode x, TreeNode y) {
        return isAncestor(root, x) && isAncestor(root, y);
    }

    private static boolean isAncestor(TreeNode currentNode, TreeNode searchedNode) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.equals(searchedNode)) {
            return true;
        }
        return isAncestor(currentNode.left, searchedNode) || isAncestor(currentNode.right, searchedNode);
    }
}
