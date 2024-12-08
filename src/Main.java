import calculator.CalculableFactory;
import view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ViewCalculator view = new ViewCalculator(new CalculableFactory());
        view.run();
    }
}
