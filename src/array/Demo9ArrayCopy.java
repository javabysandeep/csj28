package array;

public class Demo9ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {100,200,10,12};
        //int[] array2 = array1;// just a reference copy
        int[] array2 = new int[array1.length];

        for (int index = 0; index < array1.length; index++) {
            array2[index] = array1[index];
        }
        System.out.println("printing the copied array");

        for (int index = 0; index < array2.length; index++) {
            System.out.print(array2[index]+", ");
        }
    }
}
