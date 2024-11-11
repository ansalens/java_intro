import java.io.FileWriter;
import java.io.IOException;

public class fw {
    public static void main(String args[]) {
        try {
            FileWriter file = new FileWriter("sample.txt");
            file.write("Another one bites the dust\n");
            file.write("Eyes of the insane\n");
            file.append("Raining blood\n");
            file.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
