package controlStatements.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        /*
        *   1
        *   1 2
        *   1 2 3
        *   1 2 3 4
        *   1 2 3 4 5
        *
        *
        * */

        for (int row = 1; row <=10; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column+" ");
            }
            System.out.println();
        }
    }
}
