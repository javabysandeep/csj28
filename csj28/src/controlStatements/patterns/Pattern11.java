package controlStatements.patterns;

public class Pattern11 {
    public static void main(String[] args) {
        /*
        *   1 2 3 4 5
        *   2 4 6 8 10
        *   3 6 9 12 15
        *
        * */

        for (int row = 1; row <=10 ; row++) {
            for (int col = 1; col <=30 ; col++) {
                System.out.print(col* row+"\t");
            }
            System.out.println();
        }
    }
}
