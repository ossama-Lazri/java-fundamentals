public class BasicTryCatch {

    public static void main(String[] args) {

        try {
            int a = 10 / 0; // error
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues");
    }
}