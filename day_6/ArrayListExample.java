import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Ossama");
        names.add("Ali");

        System.out.println(names.get(0));

        names.remove(1);

        System.out.println("Size: " + names.size());

        for (String name : names) {
            System.out.println(name);
        }
    }
}