package operators.arithmetic;

public class Demo11 {
    public static void main(String[] args) {
        int number = 12345;
        int lastDigit = number %10;//5
        number /=10;//12345/10: Q= 1234
        int secondLastDigit = number %10;//1234%10=4
        System.out.println("last digit "+lastDigit);//5
        System.out.println("second last digit "+secondLastDigit);//4
        System.out.println("Sum of last two digits "+(lastDigit+secondLastDigit));//5+4=9
    }
}
