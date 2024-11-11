import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fr {
    public static void main(String a[]) {
        try {
            FileReader file = new FileReader("figlet.txt");
            int data = file.read();
            // as long as there are characters to be read...
            do {
                System.out.print((char) data);
                data = file.read();
            } while (data != -1);

            file.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException x) {
            x.printStackTrace();
        }
    }
}
