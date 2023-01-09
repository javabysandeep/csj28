package operators.arithmetic;

public class Demo4 {
    public static void main(String[] args) {
        int number = 123;

        int digit = 123%10;
        number = number/10;
        System.out.println("Remainder "+digit);
        System.out.println("Quotient "+number);

        digit = number%10;
        number = number/10;

        System.out.println("Remainder "+digit);
        System.out.println("Quotient "+number);


        digit = number%10;
        number = number/10;

        System.out.println("Remainder "+digit);
        System.out.println("Quotient "+number);

    }
}
