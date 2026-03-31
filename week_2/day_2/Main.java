import java.util.*;

public class Main {

    public static void main(String[] args) {

        // 🔹 Comparable (Student)
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ossama", 15));
        students.add(new Student("Ali", 12));
        students.add(new Student("Sara", 18));

        Collections.sort(students); // uses compareTo
        System.out.println("Students sorted:");
        System.out.println(students);

        // 🔹 Comparator (Product)
        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 300));
        products.add(new Product("Laptop", 1000));
        products.add(new Product("Mouse", 20));

        products.sort((a, b) -> Double.compare(a.price, b.price));

        System.out.println("Products sorted:");
        System.out.println(products);

        // 🔹 Generics test
        Box<Integer> box = new Box<>();
        box.set(10);
        System.out.println("Box: " + box.get());
    }
}