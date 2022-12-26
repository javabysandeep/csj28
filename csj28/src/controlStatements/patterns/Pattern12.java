package controlStatements.patterns;

public class Pattern12 {
    public static void main(String[] args) {
        /*
        *       * * * * *
        *        * * * *
        *         * * *
        *          * *
        *           *
        * */

        for (int row = 1; row <=5 ; row++) {
            //print space

            for (int space = 0; space <row ; space++) {
                System.out.print(" ");
            }
            //print stars
            for (int col = 5; col >=row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
