package java8Feauters;

public interface Addition {
    int add(int number1, int number2);

    public static void main(String[] args) {
//        Addition addition = (number1, number2) -> number1 + number2;
        Addition addition = Integer::sum;
        System.out.println(addition.add(10, 20));
    }
}
