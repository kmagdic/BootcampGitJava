package calculator;

public class AdvancedCalculator extends  Calculator {

    @Override
    public String listOperations() {
        return super.listOperations() + ", pow";
    }

    @Override
    public double calculate() throws Exception {
        if (operation.equals("pow"))
            return Math.pow(a, b);
        else
            return super.calculate();
    }
}
