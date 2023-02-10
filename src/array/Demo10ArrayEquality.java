package array;

import java.util.Arrays;

public class Demo10ArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {100, 200, 10, 12};
        int[] array2 = {100, 200, 10, 12};
        System.out.println("Array's are equal: " + arrayEquals(array1, null));
        boolean equals = Arrays.equals(array1, null);
        System.out.println("with equals method " + equals);

    }

    public static boolean arrayEquals(int[] array1, int[] array2) {
        if (array1 == array2) {
            return true;
        }
        //null check
        if (array1 == null || array2 == null) {
            return false;
        }
        //length check
        if (array1.length != array2.length) {
            return false;
        }

        //content should be equal
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] != array2[index]) {
                return false;
            }
        }
        return true;
    }
}
