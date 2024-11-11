public class math {
    public static void main(String args[]) {
        double x = 25.49;
        double y = 1.96;

        System.out.println("Max is " + Math.max(x, y));
        System.out.println("Mix is " + Math.min(x, y));
        System.out.println("Square root of " + x + " is " + Math.sqrt(x));
        
        System.out.println("After flooring x = " + Math.floor(x));
        System.out.println("After ceiling x = " + Math.ceil(x));
    }
}
