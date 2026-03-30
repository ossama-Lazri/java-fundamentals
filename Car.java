public class Car {

    String brand;
    int speed;

    static int numberOfCars = 0; // shared

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        numberOfCars++;
    }

    void show() {
        System.out.println(brand + " - " + speed);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 200);
        Car c2 = new Car("Audi", 180);

        c1.show();
        c2.show();

        System.out.println("Total cars: " + numberOfCars);
    }
}