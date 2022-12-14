package operators.logical;

public class Demo3 {
    public static void main(String[] args) {
        //pure logical operators : &&, ||, ! : only applicable for boolean
        //Both logical and bitwise operators: &, |, ^: applicable for all data types

        System.out.println("Logical and &&");
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        System.out.println("Logical OR ||");
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true

        System.out.println("Logical and &");
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false

        System.out.println("Logical OR |");
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true


    }
}
