public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "This person's name is " + name + " and he is " + age + " years old.\n";
    }
}
