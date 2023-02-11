package stringHandling;

public class Demo7Concat {
    public static void main(String[] args) {
        String str1 = "string handling ";
        String str2 = "is now in progress";
        System.out.println(str1 + str2);
        System.out.println(str1);
        System.out.println(str2);
        str1 = str1.concat(str2);
        System.out.println(str1);//string handling is now in progress
        System.out.println(str2);// is now in progress
    }
}
