package operators.ternary;

public class DigitSeparationLogic {
    public static void main(String[] args) {
        int number = 1234567891;
        int sum = 0;
        while (number > 0){
            int digit = number%10;
            System.out.println(digit);
            sum += digit;
            number = number/10;
        }
        System.out.println("sum of digits "+sum);
    }
}
