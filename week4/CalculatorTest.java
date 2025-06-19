public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Testing Calculator...");

        if (calculator.add(2, 3) == 5) {
            System.out.println("Addition test passed.");
        } else {
            System.out.println("Addition test failed.");
        }

        if (calculator.subtract(5, 3) == 2) {
            System.out.println("Subtraction test passed.");
        } else {
            System.out.println("Subtraction test failed.");
        }

        if (calculator.multiply(4, 2) == 8) {
            System.out.println("Multiplication test passed.");
        } else {
            System
