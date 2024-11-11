import java.util.Scanner;

public class switch_program {
    public static void main(String args[]) {
        Scanner skener = new Scanner(System.in);

        System.out.println("Enter your number of choice ---Z ");
        int number = skener.nextInt();

        switch(number) {
            case 1:
                System.out.println("One represents unity and the origin of all things");
                break;
            case 2:
                System.out.println("Two represents female principle");
                break;
            case 3:
                System.out.println("Three represents male principle");
                break;
            case 4:
                System.out.println("Four represents justice");
                break;
            case 5:
                System.out.println("Five represents marriage");
                break;
            case 6:
                System.out.println("Six represents creation");
                break;
            default:
                System.out.println("Pythagorea doesn't know that number, sorry....");
        }
        
    }
}
