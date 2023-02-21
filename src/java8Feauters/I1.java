package java8Feauters;

@FunctionalInterface
public interface I1 {
    int add(int number1, int number2);

    public static void main(String[] args) {
        // 1. Traditional way

        //2. Anonymous class way
        I1 i1 = new I1() {
            @Override
            public int add(int number1, int number2) {
                return number1+number2;
            };
        };
        System.out.println(i1.add(10,20));

        //3. lambda expression
        I1 i =  ( number1, number2) -> number1+number2;
        System.out.println("Lambda "+ i.add(20,30));

        //4. method reference
        I1 i2 = Integer::sum;
        System.out.println(i2.add(100,200));

    }
}
