package stringHandling;

public class Demo3ReverseString {
    public static void main(String[] args) {
        String str = "welcome to IT Shaala";
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;

        while (left<=right){
            char ch = chars[left];
            chars[left] = chars[right];
            chars[right] = ch;
            left++;
            right--;
        }

        for (int index = 0; index < chars.length; index++) {
            System.out.print(chars[index]);
        }
    }
}
