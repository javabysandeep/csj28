package classComponents.variables;

public class AddTest {
    public static void main(String[] args) {
        AddTest ref = new AddTest();
        System.out.println("Addition "+ref.add(10, 20));
//        System.out.println("Addition "+add(20, 30));
        System.out.println("Multiplication "+AddTest.multiply(10, 20));
        System.out.println("Multiplication "+multiply(20, 30));
    }

    void display(){
        System.out.println(add(100,200));
    }

    private  int add(int number1, int number2) {
        return number1 + number2;
    }

    private static int multiply(int number1, int number2) {
        return number1 * number2;
    }
}
