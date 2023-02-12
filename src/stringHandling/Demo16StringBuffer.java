package stringHandling;

public class Demo16StringBuffer {
    public static void main(String[] args) {
//       StringBuffer stringBuffer = "abc";//CTE: literal way is not possible
        StringBuffer stringBuffer = new StringBuffer("string");
        stringBuffer.append(" handling");
        System.out.println(stringBuffer);
        stringBuffer.insert(0,"welcome to ");
        System.out.println(stringBuffer);
        stringBuffer.deleteCharAt(0);
        System.out.println(stringBuffer);

        stringBuffer.insert(0, "w");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

    }
}
