package by.petrovich.counter;

import java.util.Scanner;

public class ConsoleReader {

    public String readConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
