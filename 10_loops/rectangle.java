import java.util.Scanner;


public class rectangle {
    public static void main(String args[]) {
        Scanner skener = new Scanner(System.in);
        int rows = 0;
        int columns = 0;
        String symbol = "";

        System.out.print("Enter a symbol to use: ");
        symbol = skener.next();

        System.out.print("Enter number of rows: ");
        rows = skener.nextInt();

        System.out.print("Enter number of columns: ");
        columns = skener.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
