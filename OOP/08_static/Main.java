public class Main {
    public static void main(String args[]) {
        // single copy in memory, linked to class not to an object
        Friend friend1 = new Friend("Kratos");
        Friend friend2 = new Friend("John Wick");
        Friend friend3 = new Friend("Subzero");
        Friend friend4 = new Friend("Light");
        System.out.println(Friend.numberOfFriends);
        // Improper way of accessing static member
        // friend1.numberOfFriends;

        Friend.printNumOfFriends();
    }
}
