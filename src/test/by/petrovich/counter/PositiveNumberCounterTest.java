package by.petrovich.counter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PositiveNumberCounterTest {
    private final static PositiveNumberCounter positiveNumberCounter = new PositiveNumberCounter();

    @Test
    void positiveNumberCount() {
        int[] numbers = new int[]{55, 4, 7, -8, 7, 78};
        int actual = positiveNumberCounter.positiveNumberCount(numbers);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }
}