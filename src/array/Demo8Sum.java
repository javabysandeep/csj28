package array;

public class Demo8Sum {
    public static void main(String[] args) {
        int[] array = {10,203,40,67,56};
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum +=array[index];
        }
        System.out.println("Sum of array elements is "+sum);
    }
}
