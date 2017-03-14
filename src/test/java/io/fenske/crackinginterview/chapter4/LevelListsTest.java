package io.fenske.crackinginterview.chapter4;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LevelListsTest {

    @Test
    public void shouldBuildLevelLists() {
        Map<Integer, List<BST>> levelLists = BSTUtils.buildLevelLists(createTree());
        Map<Integer, List<BST>> expectedLevelLists = createExpectedLevelLists();

        assertThat(levelLists, equalTo(expectedLevelLists));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenPassingNull() {
        assertThrows(IllegalArgumentException.class, () -> BSTUtils.buildLevelLists(null));
    }

    @Test
    public void shouldBuildLevelListsOutOfOneNodeBST() {
        Map<Integer, List<BST>> levelLists = BSTUtils.buildLevelLists(new BST(1));
        Map<Integer, List<BST>> expectedLevelLists = new HashMap<>();
        expectedLevelLists.put(0, Arrays.asList(new BST(1)));

        assertThat(levelLists, equalTo(expectedLevelLists));

    }

    private Map<Integer, List<BST>> createExpectedLevelLists() {
        Map<Integer, List<BST>> expectedLevelLists = new HashMap<>();
        expectedLevelLists.put(0, new LinkedList<>(Arrays.asList(new BST(4))));
        expectedLevelLists.put(1, new LinkedList<>(Arrays.asList(new BST(2), new BST(6))));
        expectedLevelLists.put(2, new LinkedList<>(
            Arrays.asList(new BST(1), new BST(3), new BST(5), new BST(7))));
        return expectedLevelLists;
    }

    private BST createTree() {
        BST node = new BST(4);
        node.left = new BST(2);
        node.right = new BST(6);
        node.left.left = new BST(1);
        node.left.right = new BST(3);
        node.right.left = new BST(5);
        node.right.right = new BST(7);
        return node;
    }
}
