package calculator;

class AdvancedCalculator extends Calculator{

    @Override
    public String listOperations() {
        return super.listOperations() + ", modulus, power, a-th root";
    }

    @Override
    public double doOperation() {
        if (operation.equals("modulus")){
            return a % b;
        }else if (operation.equals("pow")){
            return Math.pow(a, b);
        } else if (operation.equals("art")){
            return Math.pow(b, 1/a);
        }else {
            return super.doOperation();
        }

    }
}
