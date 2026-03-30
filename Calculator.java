import java.util.Scanner;

public class Calculator {

    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }
    static int div(int a, int b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Choose (+ - * /): ");
        char op = sc.next().charAt(0);

        int result;

        switch (op) {
            case '+': result = add(a, b); break;
            case '-': result = sub(a, b); break;
            case '*': result = mul(a, b); break;
            case '/': result = div(a, b); break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}