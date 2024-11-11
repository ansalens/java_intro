import java.util.Random;

public class Dice {
    // global variable is declared within a class and is visible to all parts of the class
    Random random;
    int number;

    // local variable is declared inside a method and visible only to that method
    Dice() {
        // Random random = new Random();
        // int number;
        random = new Random();
        roll();
        //roll(random, number);
    }

    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}
