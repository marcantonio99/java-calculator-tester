package cms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void add() {
        System.out.println("Test addizzione");
        Calculator calculator = new Calculator();
        float result = calculator.add(5, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    void subtract() {
        System.out.println("Test sottrazione");
        Calculator calculator = new Calculator();
        float result = calculator.subtract(5, 3f);
        Assertions.assertEquals(2, result);
    }

    @Test
    void divide() {
        System.out.println("Test divisione");
        Calculator calculator = new Calculator();
        float result = calculator.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    void multiply() {
        System.out.println("Test moltiplicazione");
        Calculator calculator = new Calculator();
        float result = calculator.multiply(3, 3);
        Assertions.assertEquals(9, result);
    }
}