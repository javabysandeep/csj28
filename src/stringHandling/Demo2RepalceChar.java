package stringHandling;

public class Demo2RepalceChar {
    public static void main(String[] args) {
        String str = "String haaaaandling";
        char[] chars = str.toCharArray();
        for (int index = 0; index < chars.length; index++) {
            if(chars[index]=='a' || chars[index]=='A'){
                chars[index] = '@';
            }
        }
        for (int index = 0; index < chars.length; index++) {
            System.out.print(chars[index]);
        }
    }
}
