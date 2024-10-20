public class Main {
    public static void main(String args[]) {
        // instanciranje objekta
        Car mojAuto = new Car();
        Car mojAuto2 = new Car();
        mojAuto2.make = "Porsche";
        mojAuto2.model = "911 Carrera";

        mojAuto.startEngine();
        System.out.println("My car color is " + mojAuto.color);
        mojAuto.crash();

        System.out.println("My second car is " + mojAuto2.make + " " + mojAuto2.model);
    }
}
