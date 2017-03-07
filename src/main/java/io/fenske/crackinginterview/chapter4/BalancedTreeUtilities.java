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
}
