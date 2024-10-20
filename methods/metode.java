public class metode {
    public static void main(String args[]) {
        String name = "Tony";
        int age = 25;
        // if you are calling a method from static method
        // that method also needs to be static
        hello(name, age);
        int sum = 0;
        sum = add(5, 4);
        System.out.println("Sum of 5 and 4 is: " + sum);
    }

    // new method needs to have return type
    static void hello(String title, int number) {
        System.out.println("Hello " + title + " you are " + number + " years old!");
    }
    
    static int add(int num1, int num2) {
        // return num1 + num2;
        int suma = num1 + num2;
        return suma;
    }
}
