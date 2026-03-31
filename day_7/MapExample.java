import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Ossama", 15);
        students.put("Ali", 12);

        System.out.println(students.get("Ossama"));

        for (String key : students.keySet()) {
            System.out.println(key + " -> " + students.get(key));
        }
    }
}