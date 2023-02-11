package stringHandling;

public class Demo9Replace {
    public static void main(String[] args) {
        String str1 = "albama is on the way";
        str1 = str1.replace('a', '@');
        System.out.println(str1);

        String str2 = "I am teaching at cyber success";
        str2 = str2.replace("cyber success","IT Shaala");
        System.out.println(str2);
    }
}
