public class ArraysExample {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1, 3};

        // access
        System.out.println(numbers[0]);

        // modify
        numbers[1] = 10;

        // loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // enhanced loop
        for (int n : numbers) {
            System.out.println("Value: " + n);
        }
    }
}