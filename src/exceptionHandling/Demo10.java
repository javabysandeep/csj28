package exceptionHandling;

public class Demo10 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("try");
        }  finally {
            System.out.println("finally");
        }
        System.out.println("rest of the main method");//this line won't be executed
    }
}
