package jmx_test;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10, 20);
        System.out.println(calculator.sum());
    }
}
