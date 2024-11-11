public class Main {
    public static void main(String args[]) {
        // polimorfizam, znaci jedan objekat vise tipova
        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        Vehicle racers[] = {car, bike, boat};

        for (Vehicle racer : racers) {
            racer.go();
        }
    }
}
