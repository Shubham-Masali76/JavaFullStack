// Create nested (inner) class to perform arithmetic operations.

public class Calculator {

    class Operations {
        public int add(int a, int b) { return a + b; }
        public int subtract(int a, int b) { return a - b; }
        public int multiply(int a, int b) { return a * b; }
        public double divide(int a, int b) {
            if (b == 0) throw new ArithmeticException("Divide by zero");
            return (double) a / b;
        }
    }

    public void performAll(int x, int y) {
        Operations op = new Operations();
        System.out.println("Add: " + op.add(x, y));
        System.out.println("Subtract: " + op.subtract(x, y));
        System.out.println("Multiply: " + op.multiply(x, y));
        System.out.println("Divide: " + op.divide(x, y));
    }

    public static void main(String[] args) {
        new Calculator().performAll(10, 2);
    }
}
