package stringHandling;

public class Demo1 {
    public static void main(String[] args) {
        char[] chars = {'a','b','c','d'};
        String str = "abcd";
        char[] charArray = str.toCharArray();

        for (int index = 0; index < chars.length; index++) {
            System.out.print(chars[index]+" ");
        }
        System.out.println("\nString array");
        for (int index = 0; index < charArray.length; index++) {
            System.out.print(charArray[index]+" ");
        }
        System.out.println("\n Reverse the char array");
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
            System.out.print(chars[index]+" ");
        }
    }
}
