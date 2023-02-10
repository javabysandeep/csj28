package array;

public class Demo15MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arrayOfArray = {
                {10, 20},
                {30, 40, 50},
                {70, 90, 100,110},
        };
        for (int row = 0; row < arrayOfArray.length; row++) {
            for (int column = 0; column < arrayOfArray[row].length; column++) {
                System.out.print(arrayOfArray[row][column]+" ");
            }
            System.out.println();
        }


    }
}
