package controlStatements.patterns;

public class Pattern7 {
    public static void main(String[] args) {
        /*
        *               *
        *              **
        *             ***
        *            ****
        *           *****
        *
        * */
       int numberOfRows = 5;
        for (int row = 1; row <=numberOfRows; row++) {
            //print spaces
            for (int space = numberOfRows-row; space >0 ; space--) {
                System.out.print(" ");
            }

            //print stars
            for (int star = 1; star <=row ; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
