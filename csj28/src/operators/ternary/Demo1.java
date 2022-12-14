package operators.ternary;

public class Demo1 {
    public static void main(String[] args) {
        //unary operators : ++, --, ~, !
        //binary operators: +, -, *, /, %, &&, &, ||, |, ^, <<, >>, >>>
        //ternary operator: conditional operator: ? :
        // (operand1) ? ( operand2) : (operand3)
        // operand 1 : value should be boolean type
        //if operand1 value is true then output will be operand2
        //if operand1 value is false then output will be operand3
        // operand1 value must be either
        //  direct boolean value,
        //  variable of type boolean
        //  function call of type boolean
        //  expression which results into type boolean
        System.out.println((true) ? ("its true") : ("its false"));//true
        System.out.println((false) ? ("its true") : ("its false"));//false
        System.out.println((4 > 5) ? ("its true") : ("its false"));//false
        //System.out.println( (4 + 5) ? ("its true") : ("its false"));//CTE
        System.out.println((4 > 3) ? ("its true") : ("its false"));//true
        System.out.println((4 > 3 & 7 < 5) ? ("its true") : ("its false"));//false
        System.out.println((4 == 5) ? ("its true") : ("its false"));//false
        System.out.println((4 != 5) ? ("its true") : ("its false"));//true


    }
}
