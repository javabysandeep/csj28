package controlStatements.forDemos;

public class Assignment2 {
    public static void main(String[] args) {
        /*
        *           *
        *           * *
        *           * * *
        *           * * * *
        *           * * * * *
        *
        *
        * */

        for (int row = 1; row <=5 ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
