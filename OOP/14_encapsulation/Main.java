public class Main {
    public static void main(String args[]) {
        Car car = new Car("Mercedes", "S class", 2024);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        car.setModel("G class");
        System.out.println(car.getModel());
    }
}
