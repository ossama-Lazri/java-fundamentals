public class Zoo {

    public static void main(String[] args) {

        Animal[] animals = {
            new Dog("Rex"),
            new Cat("Mimi"),
            new Bird("Rio")
        };

        for (Animal a : animals) {
            a.makeSound(); // polymorphism
        }
    }
}