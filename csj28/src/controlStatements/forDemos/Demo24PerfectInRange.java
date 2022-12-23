package controlStatements.forDemos;

public class Demo24PerfectInRange {
    public static void main(String[] args) {
        //going from one number to another
        for (int number = 1; number <= 10000; number++) {

            //check number is perfect or not
            int sumOfFactors = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sumOfFactors = sumOfFactors + i;
                }
            }
            if (sumOfFactors==number) {
                System.out.println(number);
            }
        }
    }
}
