package exceptionHandling;

public class Demo2 {
    public static void main(String[] args) {
        int[] array  = {1,2,3};
//        System.out.println(array[3]);
        throw  new ArrayIndexOutOfBoundsException("Index Out Of Bounds");
        // automatically identifies the problematic situation
        // creates the ArrayIndexOutOfBoundsException class object
        // then it is thrown to JRE
        // JRE gives this object to the Default exception handler
        // Default exception handler prints the exception object details
        // Terminate the program.
    }
}
