package stringHandling;

public class Demo5IsEmpty {
    public static void main(String[] args) {
        String str = "a";
        char[] chars = str.toCharArray();
        System.out.println(chars.length==0?"Its empty":"not empty");

    }
}
