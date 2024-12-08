package calculator;

public interface Calculable {
    Calculable sum(ComplexNumber arg);
    Calculable multiply(ComplexNumber arg);
    Calculable divide(ComplexNumber arg);
    ComplexNumber getResult();
}
