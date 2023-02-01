package oops.polymorphism.methodOverloading;

public class Addition {
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,30));
        System.out.println(add("string","123"));
    }

    static int add(int number1, int number2){
        return number1+ number2;
    }
    //CTE: as method return type is not considered for method overloading
    /*static void add(int number1, int number2){
        //return number1+ number2;
    }*/
    static int add(int number1, int number2, int number3){
        return number1+ number2+number3;
    }
    static  String add(String string1, String string2){
        return string1+string2;
    }

}
