package calculator;

public class ComplexCalculator implements Calculable {
    private ComplexNumber result;

    public ComplexCalculator(ComplexNumber initial) {
        this.result = initial;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        this.result = this.result.add(arg);
        return this;
    }

    @Override
    public Calculable multiply(ComplexNumber arg) {
        this.result = this.result.multiply(arg);
        return this;
    }

    @Override
    public Calculable divide(ComplexNumber arg) {
        this.result = this.result.divide(arg);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return result;
    }
}
