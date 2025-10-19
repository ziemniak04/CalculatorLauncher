public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {

        double num1 = 20.5;
        double num2 = 15.5;

        double sum = add(num1, num2);
        double difference = subtract(num1, num2);

        System.out.println("Testing Calculator");
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Addition result: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction result: " + num1 + " - " + num2 + " = " + difference);
    }
}
