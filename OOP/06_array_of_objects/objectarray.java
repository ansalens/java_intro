public class objectarray {
    public static void main(String args[]) {
        //Food[] frizider = new Food[3];

        Food food1 = new Food("Pasulj");
        Food food2 = new Food("Cvekla");
        Food food3 = new Food("Cvarci");

        // initialize right away
        Food[] frizider = {food1, food2, food3};

        /*
        frizider[0] = food1;
        frizider[1] = food2;
        frizider[2] = food3;
        */

        System.out.println("Imam u frizideru: ");
        for (Food food : frizider) {
            System.out.println(food.name);
        }
    }
}
