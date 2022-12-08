package operators.comparision;

public class Demo1 {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        System.out.println(number1 > number2);//false
        System.out.println(number1 < number2);//true
        System.out.println(number1 >= number2);//false
        System.out.println(number1 <= number2);//true
        System.out.println(number1 == number2);//false
        System.out.println(number1 != number2);//true
        /*System.out.println(true > false);//CTE
        System.out.println(true >= false);//CTE
        System.out.println(true <= false);//CTE
        */
        System.out.println("for boolean data");
        System.out.println(true == false);//false
        System.out.println(true != false);//true
        System.out.println(true != true);//false
        System.out.println(true == true);//true
        System.out.println(false == false);//true
        System.out.println(false != false);//false
    }
}
