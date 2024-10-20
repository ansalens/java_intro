public class overload {
    public static void main(String args[]) {
        // function signature for overloaded methods are all unique:
        // 1. number of parameters
        // 2. data types of parameters
        // 3. order of values
        System.out.println(add(3,9));
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));

        double res = add(3.14,2.82);
        System.out.println(res);
    }

    static int add(int a, int b) {
        System.out.println("This is the first overloaded version.");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is the second overloaded version.");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is the third overloaded version.");
        int z = a + b + c + d;
        return z;
    }

    static double add(double a, double b) {
        System.out.println("This is the fourth overloaded version.");
        return a + b;
    }
}
