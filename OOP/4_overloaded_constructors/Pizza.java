public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }

    // overloaded constructor for plain pizza
    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    // another overloaded constructor for vegan pizza
    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    // another one, this ain't pizza at all
    Pizza(String bread) {
        this.bread = bread;
    }
}
