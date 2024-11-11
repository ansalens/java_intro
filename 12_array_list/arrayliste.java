import java.util.ArrayList;

public class arrayliste {
    public static void main(String args[]) {
        /* ArrayList je dinamicki niz koji dozvoljava dodavanje
         * i oduzimanje elemenata iz niza nakon kompajliranja.
         * ArrayList moze da skladisti jedino reference tipove.
        */
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("ferrari");
        cars.add("land rover");
        cars.add("aston martin");

        // Useful methods of ArrayList
        cars.set(0, "mercedes");
        cars.remove(1);
        cars.clear();

        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));

    }
}
