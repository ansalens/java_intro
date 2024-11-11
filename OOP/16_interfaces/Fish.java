public class Fish implements Prey, Predator {
    @Override
    public void huntPrey() {
        System.out.println("This fish is large enough to hunt smaller ones...");
    }

    @Override
    public void flee() {
        System.out.println("This fish is small, so it needs to flee from bigger ones...");
    }
}
