import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String args[]) {
        Scanner skener = new Scanner(System.in);
        int x, y;
        double z;

        try {
            System.out.print("Enter the first number to divide: ");
            x = skener.nextInt();
            System.out.print("Enter the second number to divide by: ");
            y = skener.nextInt();

            z = x / y;
            System.out.println("Result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
            System.out.print("Enter the first number to divide: ");
            x = skener.nextInt();

            do {
                System.out.print("Enter second number to divide by: ");
                y = skener.nextInt();
            } while (y == 0);

            z = x / y;
            System.out.println("Result: " + z);
        }
        catch (InputMismatchException e) {
            System.out.println("Error: not a number");
        }
        /* Lazy way of catching exceptions */
        catch (Exception e) {
            System.out.println("Exception occured:");
            e.printStackTrace();
        }
        // close any open scanners or files in this block
        finally {
            skener.close();
            System.out.println("Godbye!");
        }
    }
}
