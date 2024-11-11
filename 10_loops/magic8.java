import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;


public class magic8 {
    public static void main(String args[]) {
        Scanner skener = new Scanner(System.in);
        Random random = new Random();
        String question = "";

        System.out.println("Magic 8 ball, press q to quit");

        while (true) {
            question = JOptionPane.showInputDialog("Enter your question");
            if (question.isBlank())
                continue;
            else if (question.equals("q") || question.equals("Q"))
                break;

            // sleep for 3 seconds
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            int answer = random.nextInt(3);

            if (answer == 0)
                System.out.println("No.");
            else if (answer == 1)
                System.out.println("Yes.");
            else
                System.out.println("Maybe.");
        }
    }
}
