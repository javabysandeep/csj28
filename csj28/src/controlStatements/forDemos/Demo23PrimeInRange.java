package controlStatements.forDemos;

public class Demo23PrimeInRange {
    public static void main(String[] args) {
        //going from one number to another
        for (int number = 1; number <= 1000; number++) {

            //check number is prime or not
            boolean isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
