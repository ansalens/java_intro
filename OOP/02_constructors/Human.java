public class Human {
    String name;
    int HP;
    double mana;
    
    // constructor
    Human(String name, int HP, double mana) {
        this.name = name;
        this.HP = HP;
        this.mana = mana;
    }

    void attack(String who) {
        System.out.println(this.name + " hit " + who);
    }

    void specialAttack(String who) {
        System.out.println(this.name + " dealt fatal damage to " + who);
    }
}
