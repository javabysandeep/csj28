package array;

public class Demo4EvenNumbers {
    public static void main(String[] args) {
        int[] array = {11,2,34,54,59};

        for (int index = 0; index < array.length; index++) {
            if(array[index]%2==0){
                System.out.println(array[index]);
            }
        }

    }
}
