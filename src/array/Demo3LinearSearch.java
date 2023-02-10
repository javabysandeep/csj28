package array;

public class Demo3LinearSearch {
    public static void main(String[] args) {
        int[] array = {11,2,34,54,59};
        int element = 54;

        for (int index = 0; index < array.length; index++) {
            if(element == array[index]){
                System.out.println("element found in the given array at index "+index);
            }
        }

    }
}
