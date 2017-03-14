package io.fenske.crackinginterview.chapter4;

public class BST {
    private final int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BST)) return false;

        BST bst = (BST) o;

        return value == bst.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return "BST{" +
            "value=" + value +
            '}';
    }
}
