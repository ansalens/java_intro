public class printf {
    public static void main(String args[]) {
        System.out.printf("This number is magical: %d\n", 69);
        String str = "Alejandro";
        System.out.printf("%s is a magical name\n", str);
        char ch = 'A';
        System.out.printf("All names that start with letter %4c are lucky\n", ch);
        double pi = 3.1415293;
        System.out.printf("%-9.3f is number pi limited by 3 decimals\n", pi);
        boolean facts = true;
        System.out.printf("All of these claims are %b.\n", facts);
        int money = 1000000;
        System.out.printf("$%,d is not much money\n", money);
    }
}

