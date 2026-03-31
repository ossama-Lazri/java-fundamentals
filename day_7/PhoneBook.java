import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        phoneBook.put("Ossama", "0600000000");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("Number: " + phoneBook.get(name));
        } else {
            System.out.println("Not found");
        }
    }
}