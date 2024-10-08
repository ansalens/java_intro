public class array2 {
    public static void main(String args[]) {
        int niz[] = new int[3];

        niz[0] = 23;
        niz[1] = 69;
        niz[2] = 49;
        /* java.lang.ArrayIndexOutOfBoundsException 
        niz[3] = 234;
        */

        for (int i = 0; i < niz.length; i++)
            System.out.println("niz[" + i + "] = " + niz[i]);
    }
}
