package calculator;

public class CalculableFactory implements ICalculableFactory {
    @Override
    public Calculable create(ComplexNumber primaryArg) {
        return new CalculatorLogger(new ComplexCalculator(primaryArg));
    }
}
