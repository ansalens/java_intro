import java.util.Random;

public class randomizer {
    public static void main(String args[]) {
        Random random = new Random();

        //int a = random.nextInt(6)+1;
        //double b = random.nextDouble();
        boolean c = random.nextBoolean();

        System.out.println(c);
    }
}
