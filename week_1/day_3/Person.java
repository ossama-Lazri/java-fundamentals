public class Person {

    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ossama", 25);
        p1.display();
    }
}