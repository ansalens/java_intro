import java.util.Scanner;

public class logical {
    public static void main(String args[]) {
        Scanner skener = new Scanner(System.in);

        System.out.println("Enter q or Q to quit");
        String command = skener.next();

        if (command.equals("q") || command.equals("Q"))
            System.out.println("Quitting...");
        else
            System.out.println("Continuing...");

        skener.close();
    }
}
