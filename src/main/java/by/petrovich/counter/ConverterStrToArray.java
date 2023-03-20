package by.petrovich.counter;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConverterStrToArray {
    private static final Logger LOGGER = LogManager.getLogger();

    public int[] convertStrToArray(String numbersWithSpaces) {
        String[] numbersArray = numbersWithSpaces.split(" ");
        int[] numbers = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numbersArray[i]);
            } catch (NumberFormatException e) {
                LOGGER.log(Level.ERROR, "Int value in String", e);
            }
        }
        return numbers;
    }
}
