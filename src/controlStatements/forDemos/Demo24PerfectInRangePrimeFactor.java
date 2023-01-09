package controlStatements.forDemos;

public class Demo24PerfectInRangePrimeFactor {
    public static void main(String[] args) {
        int number = 28;
        //find the factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                // write logic to check if factor is prime
                boolean isPrime = true;
                for (int j = 2; j <=i/2 ; j++) {
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println("Prime factor "+i);
                }

            }
        }

    }
}
