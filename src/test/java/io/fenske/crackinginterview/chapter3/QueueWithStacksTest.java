package io.fenske.crackinginterview.chapter3;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QueueWithStacksTest {

    private QueueWithStacks queue;

    @BeforeEach
    void setUp() {
        queue = new QueueWithStacks();
    }

    @Test
    void shouldAddAndRemove() {
        addSeries(5);
        for (int i = 0; i < 5; i++) {
            assertEquals(i, queue.remove());
        }
        assertEquals(0, queue.size());
    }

    @Test
    void shouldPeek() {
        addSeries(5);
        for (int i = 0; i < 5; i++) {
            assertEquals(0, queue.peek());
        }
    }

    private void addSeries(int upperBound) {
        for (int i = 0; i < upperBound; i++) {
            queue.add(i);
        }
    }

    @Test
    void shouldThrowUnderflowWhenRemoveFromEmptyQueue() {
        assertThrows(QueueWithStacks.UnderflowException.class, () -> queue.remove());
    }
}
