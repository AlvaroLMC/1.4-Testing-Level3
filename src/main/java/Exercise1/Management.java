package Exercise1;

public class Management {
    private final Calculator calculator;

    public Management() {
        this.calculator = new Calculator();
    }

    public void run() {
        try {
            String input1 = "10.3";
            String input2 = "2";

            double num1 = parseDouble(input1);
            double num2 = parseDouble(input2);

            System.out.println("Add: " + calculator.add(num1, num2));
            System.out.println("Subtract: " + calculator.subtract(num1, num2));
            System.out.println("Multiply: " + calculator.multiply(num1, num2));
            System.out.println("Divide: " + calculator.divide(num1, num2));
            System.out.println("Divide by zero: " + calculator.divide(2, 0));

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }

    private double parseDouble(String input) {
        return Double.parseDouble(input);
    }



}
