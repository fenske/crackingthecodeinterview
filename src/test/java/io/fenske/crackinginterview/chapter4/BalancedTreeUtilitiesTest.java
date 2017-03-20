package io.fenske.crackinginterview.chapter4;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.Test;

public class BalancedTreeUtilitiesTest {

    @Test
    void shouldValidateIfBalanced() {
        TreeNode a = new TreeNode();
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode();
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode();
        TreeNode f = new TreeNode();

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = f;

        assertFalse(BalancedTreeUtilities.isBalanced(a));

        e.left = null;

        assertTrue(BalancedTreeUtilities.isBalanced(a));
    }

    @Test
    void shouldFindLowestCommonAncestor() {
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

        assertEquals(b, BalancedTreeUtilities.findLowestCommonAncestor(a, d, g));
        assertEquals(a, BalancedTreeUtilities.findLowestCommonAncestor(a, d, h));
    }


}
