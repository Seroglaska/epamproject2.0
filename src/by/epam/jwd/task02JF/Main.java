package by.epam.jwd.task02JF;

import by.epam.jwd.task2.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calc("(2 + 2) * 2");
        calculator.calc("2 + 2 * 4 - (2 + 3 * 2) / 2 + (-10)");
        calculator.calc("2 + 2 * 2");
    }
}
