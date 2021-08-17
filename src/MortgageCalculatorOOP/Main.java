package MortgageCalculatorOOP;

public class Main {

    public static void main(String[] args) {
        int principle = (int) Console.readNumber("Principle: ", 1000, 1_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest: ", 1, 30);
        byte period = (byte) Console.readNumber("Period (Year): ", 1, 50);

        MortgageCalculator calculator = new MortgageCalculator(principle, annualInterest, period);

        MortgageReport report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }

}
