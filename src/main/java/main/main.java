package main;

import java.util.Scanner;

import processCommand.*;

public class main {
    public static void main(String[] args) {
        System.out.println("This calculator works with commands and the numbers to operate.\n" +
                "Operations allowed are: sum, minus, multiply, div, raise, root.\n" +
                "example: you type the command 'sum 5 4' it will show you 20.\n" +
                "other example, 'raise 5 2' it will show you 25.");
        Scanner scan = new Scanner(System.in);
        String line;
        while(true){
            System.out.print("Enter a operation: ");
            line = scan.nextLine();
            processCommand.readCommand(line);
        }
    }
}
