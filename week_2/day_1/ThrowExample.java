public class ThrowExample {

    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
    }

    public static void main(String[] args) {
        checkAge(16);
    }
}