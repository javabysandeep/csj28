package operators.incrementDecrement;

public class Demo1 {
    public static void main(String[] args) {
        // ++, --
        //++ increment the value by 1
        //-- decrement the value by 1
        // ++, -- are applied for variables and not for values, expressions
        //++,-- are not applicable for boolean type
        /*System.out.println(10++);
        System.out.println(10--);
        System.out.println(++10);
        System.out.println(--10);
        System.out.println(10*3++);
        System.out.println(10*3--);*/

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println(a++);//post increment //1
        System.out.println(a);
        System.out.println(++b);//pre-increment//3

        System.out.println(c--);//post decrement//3
        System.out.println(c);
        System.out.println(--d);//pre-decrement//3
    }
}
