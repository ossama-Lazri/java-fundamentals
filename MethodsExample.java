public class MethodsExample {

    // simple method
    static void sayHello() {
        System.out.println("Hello!");
    }

    // method with return
    static int add(int a, int b) {
        return a + b;
    }

    // OVERLOADING (same name, different params)
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        sayHello();

        int result1 = add(2, 3);
        int result2 = add(2, 3, 4);

        System.out.println(result1);
        System.out.println(result2);
    }
}