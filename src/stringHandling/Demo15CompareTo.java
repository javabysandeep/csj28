package stringHandling;

public class Demo15CompareTo {
    public static void main(String[] args) {
        String str1 = "B";
        String str2 = "A";

        // str1-str2= 66- 65
        System.out.println(str2.compareTo(str1));//-1
        // compareTo returns three possible values : zero, positive and negative
        // it compares the strings based on unicode[ascii] value



    }
}
