import java.util.ArrayList;


public class arrayliste2D {
    public static void main(String a[]) {
        ArrayList<String> pecivo = new ArrayList<String>();
        pecivo.add("Stap");
        pecivo.add("Burek");
        pecivo.add("Pereca");

        ArrayList<String> povrce = new ArrayList<String>();
        povrce.add("Paradajz");
        povrce.add("Kestenje");
        povrce.add("Grozdje");

        ArrayList<String> pice = new ArrayList<String>();
        pice.add("Heineken");
        pice.add("Coca cola");
        pice.add("Jack Daniels");

        ArrayList<ArrayList<String>> spisakNamirnica = new ArrayList<ArrayList<String>>();
        spisakNamirnica.add(pecivo);
        spisakNamirnica.add(povrce);
        spisakNamirnica.add(pice);

        System.out.println(spisakNamirnica);
        System.out.println(spisakNamirnica.get(2).get(2));
    }
}
