package stringHandling;

public class Demo12Read {
    public static void main(String[] args) {
        String str1 = new String("string handling");
        System.out.println(str1.charAt(0));//s

        for (int index = 0; index < str1.length(); index++) {
            System.out.println(str1.charAt(index));
        }
        System.out.println("using char array");

        char[] charArray = str1.toCharArray();
        for (int index = 0; index < charArray.length; index++) {
            System.out.println(charArray[index]);
        }


    }
}
