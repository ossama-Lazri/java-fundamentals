public class LoopsExample {
    public static void main(String[] args) {

        // FOR
        for (int i = 1; i <= 5; i++) {
            System.out.println("For: " + i);
        }

        // WHILE
        int j = 1;
        while (j <= 5) {
            System.out.println("While: " + j);
            j++;
        }

        // DO-WHILE
        int k = 1;
        do {
            System.out.println("Do-While: " + k);
            k++;
        } while (k <= 5);
    }
}