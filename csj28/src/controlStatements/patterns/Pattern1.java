package controlStatements.patterns;

public class Pattern1 {
    public static void main(String[] args) {
        /*
        *   ******
        *   ******
        *   ******
        *
        * */

        for (int row = 1; row <=10; row++) {
            for (int column = 1; column <=10 ; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
