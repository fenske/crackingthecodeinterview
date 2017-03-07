package io.fenske.crackinginterview.chapter4;

import static junit.framework.TestCase.assertTrue;
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
}
