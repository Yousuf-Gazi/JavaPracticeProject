package WageCalculator;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(50_000, 200);
        Employee.printNumberOfEmployees();
        int wage = employee.wageCalculate(5);
        System.out.println(wage);
    }

}
