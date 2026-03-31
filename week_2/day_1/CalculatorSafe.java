import java.util.Scanner;

public class CalculatorSafe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            int a = sc.nextInt();

            System.out.print("Enter b: ");
            int b = sc.nextInt();

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: division by zero");
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Done");
        }
    }
}