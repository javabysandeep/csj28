package array;

public class Demo14MultiDimensionalArray {
    public static void main(String[] args) {
        int[] array = {10, 20};
        int[][] arrayOfArray = {
                {10, 20},
                {30, 40, 50}
        };//jagged array: array which contains different size arrays as its elements

        System.out.println("Array size "+ arrayOfArray.length);//2
        System.out.println("Internal Array size "+ arrayOfArray[0].length);//2
        System.out.println("Internal Array size "+ arrayOfArray[1].length);//3

        int[][] arrayOfArray1 = new int[3][];
        System.out.println("Size"+arrayOfArray1.length);//3
        System.out.println(arrayOfArray1[0]);//null
        System.out.println(arrayOfArray1[1]);//null
        System.out.println(arrayOfArray1[2]);//null

        int[][] arrayOfArray2 = new int[3][0];
        System.out.println(arrayOfArray2[0]);//reference of an object which do not have any value
        System.out.println(arrayOfArray2[1]);//reference of an object which do not have any value
        System.out.println(arrayOfArray2[2]);//reference of an object which do not have any value

        int[][] arrayOfArray3 = new int[3][1];
        System.out.println(arrayOfArray3[0].length);//1
        System.out.println(arrayOfArray3[1].length);//1
        System.out.println(arrayOfArray3[2].length);//1
    }
}
