package stringHandling;

public class Demo4ContainsString {
    public static void main(String[] args) {
        String str = "welcome to IT Shaala";
        char[] chars = str.toCharArray();
        char ch = 'I';
        for (int index = 0; index < chars.length; index++) {
            if(ch==chars[index]){
                System.out.println("character found at index "+index);
            }
        }

    }
}
