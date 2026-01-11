package Services;

public class CalculatorService {
    public double calculate(double a, double b, String type) {
        return switch (type) {
            case "sum" -> a + b;
            case "sub" -> a - b;
            case "mul" -> a * b;
            case "div" -> {
                if (b == 0.0) {
                    throw new ArithmeticException("Division by zero");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Unknown operation");
        };
    }
}
