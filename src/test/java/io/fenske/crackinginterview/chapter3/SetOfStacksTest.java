package io.fenske.crackinginterview.chapter3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetOfStacksTest {

    private SetOfStacks setOfStacks;

    @BeforeEach
    void setUp() {
        setOfStacks = new SetOfStacks(1);
    }

    @Test
    public void shouldUnderflowWhenPopEmpty() {
        assertThrows(SetOfStacks.UnderflowException.class, () -> setOfStacks.pop());
    }

    @Test
    void shouldPeek() {
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.pop();
        assertEquals(1, setOfStacks.peek());
    }

    @Test
    void shouldCheckIfEmpty() {
        setOfStacks.push(1);
        setOfStacks.push(1);
        setOfStacks.pop();
        assertFalse(setOfStacks.isEmpty());
    }

    @Test
    void shouldPopAtIndexWhenCorrectIndex() {
        assertThrows(SetOfStacks.IllegalElementException.class, () -> setOfStacks.popAt(5));
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        assertEquals(2, setOfStacks.popAt(1));
        assertEquals(2, setOfStacks.piles());

    }
}
