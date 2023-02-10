package array;

public class Demo12MaxArray {
    public static void main(String[] args) {
        int[] array1 = {1100, 20001, 10, 12, 6989};
       int max = Integer.MIN_VALUE;//-2147483648
        for (int index = 0; index < array1.length; index++) {
            //-2147483648 < 100
            if(max < array1[index]){
                max = array1[index];
            }
        }
        System.out.println("Maximum "+max);

    }
}
