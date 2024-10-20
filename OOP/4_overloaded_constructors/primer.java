public class primer {
    public static void main(String args[]) {
        Pizza pica = new Pizza("thicc", "kecap", "mocarela", "sampinjoni");

        System.out.println("You ordered pizza with: ");
        System.out.printf("%s koricom, %s sos, %s sirom i %s od gore.\n", pica.bread, pica.sauce, pica.cheese, pica.topping);

        Pizza pica2 = new Pizza("thin", "mayonaise", "cheddar");
        System.out.println("You ordered pizza with: ");
        System.out.printf("%s koricom, %s sos, %s sirom i %s od gore.\n", pica2.bread, pica2.sauce, pica2.cheese, pica2.topping);

        Pizza pica3 = new Pizza("debela");
        System.out.println("This ain't pizza at all because you ordered only " + pica3.bread + " bread and " + pica3.sauce + " " + pica3.cheese + " " + pica3.topping);
    }
}
