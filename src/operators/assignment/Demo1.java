package operators.assignment;

public class Demo1 {
    public static void main(String[] args) {
        int number = 20;//= assignment operator
        number = 20 * 30 + 'A';
        number = addValue();
        int number2 = 400;
        number = number2;
//        500=400;
        System.out.println(number);
        int age = 40;
        System.out.println(age = 500);
        System.out.println(5 * 5);
    }

    private static int addValue() {
        return 5000;
    }
}
