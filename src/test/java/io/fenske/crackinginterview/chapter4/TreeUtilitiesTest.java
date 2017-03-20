package io.fenske.crackinginterview.chapter4;

import static junit.framework.TestCase.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TreeUtilitiesTest {

    @Test
    public void shouldCheckIfContainsTree() {
        TreeNode a = new TreeNode();
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode();
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode();
        TreeNode f = new TreeNode();
        TreeNode g = new TreeNode();
        TreeNode h = new TreeNode();

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        f.left = h;

        TreeNode i = new TreeNode();

        assertTrue(TreeUtilities.containsTree(a, e));
        assertFalse(TreeUtilities.containsTree(a, i));
    }
}
