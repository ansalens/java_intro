import java.util.ArrayList;


public class foreach {
    public static void main(String z[]) {
        String zestina[] = {"Chivas Regal", "Jack Daniels", "Johnnie Walker"};

        // : je "in" keyword
        /*
        for (String pice : zestina)
            System.out.println(pice);
        */

        ArrayList<String> piva = new ArrayList<String>();
        piva.add("Zajecarsko");
        piva.add("Jelen");
        piva.add("Heineken");

        for (String pivo : piva)
            System.out.println(pivo);

    }
}
