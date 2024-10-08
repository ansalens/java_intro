import java.util.Scanner;

public class whileloop {
    public static void main(String args[]) {
        Scanner skener = new Scanner(System.in);
        String ime = "";

        do {   
            System.out.print("Please enter your name: ");
            ime = skener.nextLine();
        } while (ime.isBlank());

        System.out.println("Welcome back " + ime);

    }
}
