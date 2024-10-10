/* wrapper class je nacin da koristis primitivne tipove podataka kao reference tipove.
 * Reference tipovi imaju korisne metode ali su dosta sporiji od primitivnih.
 * Autoboxing = konverzija primitivnih vrednosti u odgovarajucu wrapper klasu.
 * Unboxing = obrnuto od autoboxing, pristup vrednostima koje se nalaze u wrapper klasu.
*/

public class wrappers {
    public static void main(String args[]) {
        // autoboxing
        Boolean a = true;
        Character b = 'L';
        Double c = 3.1514;
        Integer d = 94;
        String e = "Testing";

        // unboxing
        if (a == true)
            System.out.println("This is true!");

    }
}
