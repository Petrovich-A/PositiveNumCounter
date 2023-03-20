package by.petrovich.counter;

public class PositiveNumberCounter {
    public int positiveNumberCount(int[] numbers){
        int counter = 0;
        for (int number : numbers) {
            if (number > 0){
                counter++;
            }
        }
        return counter;
    }

}
