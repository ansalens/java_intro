import java.util.Scanner;

public class hipotenuza {
    public static void main(String args[]) {
        Scanner skener = new Scanner(System.in);

        System.out.println("Enter side a: ");
        double a = skener.nextDouble();
        System.out.println("Enter side b: ");
        double b = skener.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Hypotenuse is: " + c);

        skener.close();
    }
}
