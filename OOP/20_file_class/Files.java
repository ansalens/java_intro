import java.io.File;

public class Files {
    public static void main(String args[]) {
        //File file = new File("/etc/hosts.txt");
        File file = new File("file.txt");

        if (file.exists()) {
            System.out.println("It exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else
            System.out.println("It doesn't exist.");
    }
}
