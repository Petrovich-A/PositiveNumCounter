package by.petrovich.counter;

public class ConverterStrToArray {
    public int[] convertStrToArray(String numbersWithSpaces){
        String[] numbersArray = numbersWithSpaces.split(" ");
        int[] numbers = new int[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbers[i] = Integer.parseInt(numbersArray[i]);
        }
        return numbers;
    }
}
