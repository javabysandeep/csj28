package array;

public class Demo13MinArray {
    public static void main(String[] args) {
        int[] array1 = {1100, 20001, 10, 12, 6989};
       int min = Integer.MAX_VALUE;//2147483647
        System.out.println(min);
        for (int index = 0; index < array1.length; index++) {
            //2147483647 > 1100
            if(min > array1[index]){
                min = array1[index];
            }
        }
        System.out.println("Minimum "+min);

    }
}
