package array;

public class Demo1 {
    public static void main(String[] args) {
        // if we specify the array size in negative we get the NegativeArraySizeException
        //way 1: in this all the array elements will be initialized with default value
        int[] array = new int[0];

        //way2 : in this array elements will be initialized with the specified values
        int[] array2 = {1,2,3,4};

        //way3: array declaration + array initialization
        int[] array3;
        //array3 = {1,2,3};//CTE
        array3 = new int[5];

        // whenever we create an array,
        // we create an object inside the heap
        // and all the array elements will be stored as part of the object sequentially.

    }
}
