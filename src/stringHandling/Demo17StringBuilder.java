package stringHandling;

public class Demo17StringBuilder {
    public static void main(String[] args) {
//       StringBuffer stringBuilder = "abc";//CTE: literal way is not possible
        StringBuilder stringBuilder = new StringBuilder("string");
        stringBuilder.append(" handling");
        System.out.println(stringBuilder);
        stringBuilder.insert(0,"welcome to ");
        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(0);
        System.out.println(stringBuilder);

        stringBuilder.insert(0, "w");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
