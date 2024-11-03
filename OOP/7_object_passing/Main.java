public class Main {
    public static void main(String args[]) {
        Garage garaza = new Garage();
        Car auto1 = new Car("Mercedes");
        Car auto2 = new Car("Fiat");

        // Pass Car objects into method from another class
        garaza.park(auto1);
        garaza.park(auto2);
    }
}
