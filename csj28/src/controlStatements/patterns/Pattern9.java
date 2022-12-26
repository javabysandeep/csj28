package controlStatements.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        /*
        *               1
        *              22
        *             333
        *            4444
        *           55555
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
                System.out.print(row);
            }

            System.out.println();
        }
    }
}
