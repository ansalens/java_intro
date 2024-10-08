import java.util.Scanner;

public class user_input {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you " + name + "?");
        int age = scanner.nextInt();
        // avoid new line skipping last input
        scanner.nextLine();

        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        System.out.println("Your name is " + name + ", you are " + age + " years old.");
        System.out.print("And you like " + food + ".\n");

    }
}
