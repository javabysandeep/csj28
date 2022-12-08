package operators.logical;

public class Demo1 {
    public static void main(String[] args) {
        //Pure logical operators operators : &&, ||, !
        // operands should be of type boolean
        // System.out.println(10&&20);//CTE
        //System.out.println(10||20);//CTE
        //System.out.println(!20);//CTE

        boolean operand1 = 10 > 5;
        boolean operand2 = 5 < 6;

        System.out.println(operand1 && operand2);//true
        System.out.println((5 > 4) && (3 < 2));//false
        System.out.println((5 > 4) || (3 < 2));//true
        System.out.println((5 > 40) || (3 < 2));//false
        System.out.println((5 > 40) != (3 < 2));//false

        System.out.println("AND operation");
        System.out.println(true && true);//true
        System.out.println(true && false);//false
        System.out.println(false && false);//false
        System.out.println(false && true);//false

        System.out.println("OR operations");
        System.out.println(true || true);//true
        System.out.println(true || false);//true
        System.out.println(false || false);//false
        System.out.println(false || true);//true

        System.out.println("XOR operations");
        System.out.println(true ^ true);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ false);//false
        System.out.println(false ^ true);//true



        // Both Logical as well as bitwise operators : &,  |, ^

    }
}
