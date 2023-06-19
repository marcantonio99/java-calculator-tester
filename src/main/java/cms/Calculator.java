package cms;


public class Calculator {
    //creo i metodi della calcolatrice
    public float add(float num1, float num2) {
        return num1 + num2;
    }

    public float subtract(float num1, float num2) {
        return num1 - num2;
    }

    public float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new ArithmeticException("non si può dividere per zero");
        }
        return num1 / num2;
    }

    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
