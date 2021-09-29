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
        return " + - * /";
    }

    public double doOperation() {
        switch (operation){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }

}
