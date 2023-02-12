package stringHandling;

public class Demo20ForEach {
    public static void main(String[] args) {
        char[] chars = {'a','b','c','d'};
        for (char ch : chars) {
            if(ch!='a'){
                System.out.println(ch);
            }
        }

        int[] array = {11,12,34,56,78,13,17};
        for (int temp:array) {
            if(temp%2==0){
                System.out.print(temp+" ");
            }
        }
    }
}
