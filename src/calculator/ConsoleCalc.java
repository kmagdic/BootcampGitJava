package calculator;

import java.util.Scanner;

public class ConsoleCalc {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        // intro
        Calculator c = null;
        System.out.println("Welcome to great Calculator!");
        System.out.println("Which calculator do you need?\n" +
                "1 - Basic calculcator\n" +
                "2 - Advanced calculator");
        int type = s.nextInt();
        if (type == 1)
            c = new Calculator();
        else if (type == 2)
            c = new AdvancedCalculator();

        System.out.println("Supported operations are: " +
                c.listOperations());

        // enter data
        System.out.println("Enter expression in format " +
                "<a> <operation> <b>");
        c.setA(s.nextDouble());
        c.setOperation(s.next());
        c.setB(s.nextDouble());

        // calculate
        try {
            System.out.printf("Result is: " + c.calculate());
        } catch (ArithmeticException e) {
            System.out.println("Aritmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
