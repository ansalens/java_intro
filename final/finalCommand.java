public class finalCommand {
    public static void main(String a[]) {
        final double PI = 3.14159;

        // causes error because PI is constant
        PI = 3;
        System.out.println(PI);
    }
}
