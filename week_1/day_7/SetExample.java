import java.util.HashSet;

public class SetExample {

    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();

        names.add("Ossama");
        names.add("Ali");
        names.add("Ossama"); // duplicate

        System.out.println(names); // no duplicates

        for (String name : names) {
            System.out.println(name);
        }
    }
}