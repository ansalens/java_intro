public class Car {
    String make = "Mercedes";
    String model = "S class";
    int year = 2021;
    String color = "Black";
    double price = 60000.00;

    void startEngine() {
        System.out.println("You started the engine...");
    }

    void crash() {
        System.out.println("You crashed my car!");
        price -= 10000;
        System.out.println("It's price now must be lowered to " + price);
    }
}
