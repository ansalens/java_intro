import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        /* Dinamicki polimorfizam je sposobnost menjanja
         * tipa objekta tokom izvrsavanja programa. */

        Animal animal;
        Scanner skener = new Scanner(System.in);
        System.out.print("1) Dog\n2) Cat\nChoice: ");
        int choice = skener.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            animal.speak();
        }
    }
}
