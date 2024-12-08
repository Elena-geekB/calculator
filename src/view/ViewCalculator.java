package view;

import calculator.Calculable;
import calculator.ComplexNumber;
import calculator.ICalculableFactory;

import java.util.Scanner;

public class ViewCalculator {
    private final ICalculableFactory factory;

    public ViewCalculator(ICalculableFactory factory) {
        this.factory = factory;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите действительную часть первого комплексного числа: ");
            double real1 = scanner.nextDouble();
            System.out.println("Введите мнимую часть первого комплексного числа: ");
            double imaginary1 = scanner.nextDouble();
            ComplexNumber num1 = new ComplexNumber(real1, imaginary1);

            Calculable calculator = factory.create(num1);

            while (true) {
                System.out.println("Введите операцию (+, *, /, =): ");
                String operation = scanner.next();

                if (operation.equals("=")) {
                    System.out.println("Результат: " + calculator.getResult());
                    break;
                }

                System.out.println("Введите действительную часть следующего комплексного числа: ");
                double real2 = scanner.nextDouble();
                System.out.println("Введите мнимую часть следующего комплексного числа: ");
                double imaginary2 = scanner.nextDouble();
                ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

                switch (operation) {
                    case "+":
                        calculator.sum(num2);
                        break;
                    case "*":
                        calculator.multiply(num2);
                        break;
                    case "/":
                        calculator.divide(num2);
                        break;
                    default:
                        System.out.println("Неверная операция.");
                }
            }

            System.out.println("Хотите продолжить? (Y/N): ");
            if (!scanner.next().equalsIgnoreCase("Y")) {
                break;
            }
        }

        scanner.close();
    }
}
