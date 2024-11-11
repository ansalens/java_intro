public class habibi {
    public static void main(String args[]) {
        Car auto = new Car();

        System.out.println("Moj auto je " + auto.make);
        // where in memory does our class live?
        //System.out.println(auto);
        //System.out.println(auto.toString()); same as line before

        // print every attribute (explicitly)
        //System.out.println(auto.toString());
        // print every attribute (implicitly)
        System.out.println(auto);
    }
}
