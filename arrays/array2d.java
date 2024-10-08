public class array2d {
    public static void main(String args[]) {
        String parking[][] = new String[3][3];

        parking[0][0] = "Porsche";
        parking[0][1] = "BMW";
        parking[0][2] = "Ford";
        parking[1][0] = "Range rover";
        parking[1][1] = "Fiat";
        parking[1][2] = "Ferrari";
        parking[2][0] = "Mercedes";
        parking[2][1] = "Mustang";
        parking[2][2] = "Corvette";

        /* 2nd way of making 2D arrays
        String parking[][] = {  {"car1", "car2", "car3"},
                                {"car4", "car5", "car6"},
                                {"car7", "car8", "car9"}
                             };
        */

        for (int row = 0; row < parking.length; row++) {
            for (int column = 0; column < parking[row].length; column++) {
                System.out.print(parking[row][column] + " ");
            }
            System.out.println();
        }
    }
}
