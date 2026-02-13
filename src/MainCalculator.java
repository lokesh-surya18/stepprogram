import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                Addition add = new Addition();
                System.out.println("Result: " + add.calculate(num1, num2));
                break;

            case 2:
                Subtraction sub = new Subtraction();
                System.out.println("Result: " + sub.calculate(num1, num2));
                break;

            case 3:
                Multiplication mul = new Multiplication();
                System.out.println("Result: " + mul.calculate(num1, num2));
                break;

            case 4:
                Division div = new Division();
                System.out.println("Result: " + div.calculate(num1, num2));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
