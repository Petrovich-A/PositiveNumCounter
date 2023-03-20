import by.petrovich.counter.ConsoleReader;
import by.petrovich.counter.ConverterStrToArray;
import by.petrovich.counter.PositiveNumberCounter;

public class main {
    private static final ConverterStrToArray converterStrToArray = new ConverterStrToArray();
    private static final PositiveNumberCounter positiveNumberCounter = new PositiveNumberCounter();
    private static final ConsoleReader consoleReader = new ConsoleReader();

    public static void main(String[] args) {
        System.out.println("input numbers divided by space: ");
        String numbersWithSpaces = consoleReader.readConsole();
        int[] numbers = converterStrToArray.convertStrToArray(numbersWithSpaces);
        int amountPositiveNumbers = positiveNumberCounter.positiveNumberCount(numbers);
        System.out.println("Positive numbers amount: " + amountPositiveNumbers);
    }
}
