package operators.ternary;

public class Demo5MinOfThree {
    public static void main(String[] args) {

        //min of three numbers
        int number1 = 190;
        int number2 = 200;
        int number3 = 30;
        System.out.println(

                (number1 < number2 && number1 < number3)
                        ? (number1)
                        : (
                                (number2 < number1 && number2 < number3)
                                        ? (number2)
                                        : (number3)
                            )

        );
    }
}
