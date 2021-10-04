package calculator;

public class Calculator {
    protected double a;
    protected double b;
    protected String operation;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String listOperations() {
        return "+, -, *, /";
    }

    public double calculate() throws Exception {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                if (a * b > 10000000)
                    throw new ArithmeticException("Numbers A & B are too big");
                return a * b;
            case "/":
                if (b == 0)
                    throw new ArithmeticException("Division by zero is not allowed");
                return a / b;
        }

        throw new Exception("Operation not supported: " + operation);

    }
}
