package controlStatements.patterns;

public class Pattern13 {
    public static void main(String[] args) {
        /*
         *       5 5 5 5 5
         *        4 4 4 4
         *         3 3 3
         *          2 2
         *           1
         * */

        for (int row = 1; row <= 5; row++) {
            //print space

            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            //print stars
            for (int col = 5; col >= row; col--) {
                System.out.print(6 - row + " ");
            }
            System.out.println();
        }
    }
}
