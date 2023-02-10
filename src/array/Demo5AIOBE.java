package array;

public class Demo5AIOBE {
    public static void main(String[] args) {
        int[] array = {11,2,34,54,59};
        //ArrayOutOfBoundsException is thrown when an attempt is made to access the
        // Array with an illegal index.
        System.out.println(array[-1]);
    }
}
