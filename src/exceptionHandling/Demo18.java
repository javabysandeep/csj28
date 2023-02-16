package exceptionHandling;

public class Demo18 {
    static {
        System.out.println("Demo18 class is loaded in the memory with the help of forname method");
    }
    public static void main(String[] args) {
       try {
           m1();
       }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
           System.out.println("Invalid index");
       }
        System.out.println("rest of the main method");
    }

    public static void m1() {
        m2();
    }

    public static void m2() {
        m3();
    }

    public static void m3() {
        int[] array = {1,2};
        System.out.println(array[2]);
    }
}
