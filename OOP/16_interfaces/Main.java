public class Main {
    public static void main(String args[]) {
        /* Interfejs je nesto slicno kao apstraktna klasa.
         * Klase koje implementiraju interfejs moraju da
         * dovrse definiciju svih metoda u interfejsu.
         * Sa interfejsom je moguce "visestruko" nasledjivanje.
         * Odnosno vise interfejsa se moze primeniti na jednoj klasi. */

        Eagle oro = new Eagle();
        oro.huntPrey();
        Rabbit zeka = new Rabbit();
        zeka.flee();

        Fish riba = new Fish();
        riba.flee();
        riba.huntPrey();
    }
}
