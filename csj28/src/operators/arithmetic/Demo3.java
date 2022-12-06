package operators.arithmetic;

public class Demo3 {
    public static void main(String[] args) {
        int number = 123;
        int sumOfDigits = 0;

        int digit = 123%10;
        sumOfDigits = sumOfDigits + digit;
        number = number/10;
        System.out.println("Remainder "+digit);
        System.out.println("Quotient "+number);

        digit = number%10;
        sumOfDigits = sumOfDigits + digit;
        number = number/10;

        System.out.println("Remainder "+digit);
        System.out.println("Quotient "+number);


        digit = number%10;
        sumOfDigits = sumOfDigits + digit;
        number = number/10;

        System.out.println("Remainder "+digit);
        System.out.println("Quotient "+number);
        System.out.println("Sum of digits "+sumOfDigits);

    }
}
