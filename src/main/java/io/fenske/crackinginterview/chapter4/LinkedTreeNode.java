package io.fenske.crackinginterview.chapter4;

public class LinkedTreeNode {
    LinkedTreeNode parent;
    LinkedTreeNode left;
    LinkedTreeNode right;
    int value;

    public LinkedTreeNode(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkedTreeNode)) return false;

        LinkedTreeNode that = (LinkedTreeNode) o;

        return value == that.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "LinkedTreeNode{" +
            "value=" + value +
            '}';
    }
}
