package stringHandling;

public class Demo13Contains {
    public static void main(String[] args) {
        String str = "string handling";
        System.out.println(str.contains("string"));
        System.out.println(str.indexOf("h"));

        System.out.println("string starts with st: "+str.startsWith("st"));
        System.out.println("string ends with ing: "+str.endsWith("ing"));

    }
}
