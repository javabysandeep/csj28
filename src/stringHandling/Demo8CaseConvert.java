package stringHandling;

public class Demo8CaseConvert {
    public static void main(String[] args) {
        String str1 = "string handling";
        //to convert in uppercase: toUpperCase
        str1 = str1.toUpperCase();
        System.out.println(str1);

        String str2 = "WELCOME TO GOA SINGHAM";
        str2 = str2.toLowerCase();
        System.out.println(str2);

        String str3 = "                  welcome to pune        ";
        str3 = str3.trim();
        System.out.println("size of str3 "+str3.length());

    }
}
