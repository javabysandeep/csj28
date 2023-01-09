package controlStatements.patterns;

public class Pattern5 {
    public static void main(String[] args) {
        /*
        *   1
        *   2 3
        *   4 5 6
        *   7 8 9 10
        *   11 12 13 14
        *
        *
        * */
        int counter = 1;
        for (int row = 1; row <=10; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(counter++ +" ");
            }
            System.out.println();
        }
    }
}
