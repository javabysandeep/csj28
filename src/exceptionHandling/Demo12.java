package exceptionHandling;

public class Demo12 {
    public static void main(String[] args) {
        System.out.println("Value "+getValue());//3
    }
    public static int getValue(){
        try {
            return 1;
        }catch (Exception e){
            return 2;
        } finally {
            return 3;
        }
    }
}
