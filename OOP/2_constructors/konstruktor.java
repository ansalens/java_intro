public class konstruktor {

    public static void main(String args[]) {
        Human betmen = new Human("Bruce Wayne", 70, 54.9);
        Human joker = new Human("Joker", 95, 34.93);

        System.out.println(betmen.name + " VS " + joker.name);

        betmen.attack(joker.name);
        joker.specialAttack(betmen.name);
    }
}
