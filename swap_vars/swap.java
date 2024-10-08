public class swap {
    public static void main(String args[]) {
        String x = "Voda";
        String y = "Cedevita";
        String temp = null;

        temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
