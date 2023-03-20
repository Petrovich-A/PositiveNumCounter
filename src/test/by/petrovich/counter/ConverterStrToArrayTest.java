package by.petrovich.counter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterStrToArrayTest {
    private final static ConverterStrToArray converterStrToArray = new ConverterStrToArray();

    @Test
    void convertStrToArray() {
        String numbersWithSpaces = "55 4 7 -8 7 78";
        int[] actual = converterStrToArray.convertStrToArray(numbersWithSpaces);
        int[] expected = new int[]{55, 4, 7, -8, 7, 78};
        Assertions.assertArrayEquals(actual, expected);
    }
}