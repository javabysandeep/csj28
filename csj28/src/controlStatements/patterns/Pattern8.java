package controlStatements.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        /*
        *               1
        *              12
        *             123
        *            1234
        *           12345
        *
        * */
       int numberOfRows = 5;
        for (int row = 1; row <=numberOfRows; row++) {
            //print spaces
            for (int space = numberOfRows-row; space >0 ; space--) {
                System.out.print(" ");
            }

            //print number
            for (int column = 1; column <=row ; column++) {
                System.out.print(column);
            }

            System.out.println();
        }
    }
}
