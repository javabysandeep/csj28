package classComponents.methods.assignments;

public class Apps {
    public static void main(String[] args) {
        //printTable(17);
        //printPrimeFactors(100);

        for (int index = 1; index <= 10000; index++) {
            if (isPerfect(index)) {
                System.out.println(index);
            }
        }
    }

    private static boolean isPerfect(int number) {
        int sumOfFactors = 0;
        for (int index = 1; index <= number / 2; index++) {
            if (number % index == 0) {
                sumOfFactors = sumOfFactors + index;
            }
        }
        return sumOfFactors == number;
    }

    private static void printTable(int number) {
        for (int index = 1; index <= 10; index++) {
            System.out.println(number * index);
        }
    }

    private static void printPrimeFactors(int number) {
        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
                if (isPrime(index)) {
                    System.out.println(index);
                }
            }
        }
    }

    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return isPrime;
    }
}
