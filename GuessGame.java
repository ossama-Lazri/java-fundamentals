import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        int secret = 7;
        int guess;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Guess number: ");
            guess = sc.nextInt();

            if (guess > secret) {
                System.out.println("Too high");
            } else if (guess < secret) {
                System.out.println("Too low");
            }

        } while (guess != secret);

        System.out.println("Correct!");
    }
}