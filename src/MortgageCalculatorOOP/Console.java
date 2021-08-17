package MortgageCalculatorOOP;

import java.util.Scanner;

public class Console {
    //scanner used as static field if we need to create scanner multiple times in this class
    private static Scanner input = new Scanner(System.in);

    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            value = input.nextDouble();
            if (value >= min && value <=max)
                break;
            System.out.println("Enter the number between" + min + " and " + max);
        }
        return value;
    }
}
