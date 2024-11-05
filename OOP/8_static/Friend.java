public class Friend {
    static int numberOfFriends = 0;
    String name;

    Friend(String name) {
        this.name = name;
        numberOfFriends++;
    }

    static void printNumOfFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}
