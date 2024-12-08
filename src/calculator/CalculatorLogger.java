package calculator;

public class CalculatorLogger implements Calculable {
    private final Calculable calculator;

    public CalculatorLogger(Calculable calculator) {
        this.calculator = calculator;
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        System.out.println("Сложение: " + arg);
        Calculable result = calculator.sum(arg);
        System.out.println("Результат: " + calculator.getResult());
        return result;
    }

    @Override
    public Calculable multiply(ComplexNumber arg) {
        System.out.println("Умножение на: " + arg);
        Calculable result = calculator.multiply(arg);
        System.out.println("Результат: " + calculator.getResult());
        return result;
    }

    @Override
    public Calculable divide(ComplexNumber arg) {
        System.out.println("Деление на: " + arg);
        Calculable result = calculator.divide(arg);
        System.out.println("Результат: " + calculator.getResult());
        return result;
    }

    @Override
    public ComplexNumber getResult() {
        return calculator.getResult();
    }
}
