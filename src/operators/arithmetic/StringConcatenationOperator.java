package operators.arithmetic;

public class StringConcatenationOperator {
    public static void main(String[] args) {
        System.out.println(10 + 20);//30: mathematical addition
        System.out.println(10 + "20");//1020: string concatenation
        System.out.println(10 + 20 + "A" + 30 + 40);//30A3040
        System.out.println('A' + 'A' + 30 + 40);//200
        System.out.println('A' + "A" + 30 + 40);//AA3040
        System.out.println('A' + "A");//AA
        System.out.println('A' + 'A');//130

    }
}



















