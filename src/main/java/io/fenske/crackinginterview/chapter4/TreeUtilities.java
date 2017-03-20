package io.fenske.crackinginterview.chapter4;

public class TreeUtilities {
    public static boolean containsTree(TreeNode t1, TreeNode t2) {
        if (t2 == null) {
            return true;
        }
        return isSubtree(t1, t2);
    }

    private static boolean isSubtree(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return false;
        }
        if (t1.equals(t2)) {
            if (isMatch(t1, t2)) {
                return true;
            }
        }
        return isSubtree(t1.left, t2) || isSubtree(t1.right, t2);
    }

    private static boolean isMatch(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (!t1.equals(t2)) {
            return false;
        }
        return isMatch(t1.left, t2.left) && isMatch(t2.right, t2.right);
    }
}
