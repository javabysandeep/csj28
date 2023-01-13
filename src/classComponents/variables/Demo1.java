package classComponents.variables;

public class Demo1 {
    public static void main(String[] args) {
        int number1;//declaration
        number1 = 100;// initialization

        int number2 = 200;//definition = declaration + initialization
        System.out.println(add(number1, number2));//3000
        System.out.println("number1 from main "+number1);//100
        System.out.println("number2 from main "+number2);//200
    }
    static int add(int number1, int number2){
        number1 = 1000;
        number2 = 2000;
        //number1 and number2 are also local variables
        // these are local to add method
        return number1 + number2;
    }
}
