public class Dog extends Animal {

    public Dog(String name) {
        super(name); // call parent constructor
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof");
    }
}