public class Car {
    String make = "BMW";
    String model = "530d";
    String color = "Dark blue";
    int year = 2024;

    // Override the default toString method to return every attribute
    public String toString() {
        String ret = color + " " + make + " " + model + " " + year;
        return ret;
    }
}
