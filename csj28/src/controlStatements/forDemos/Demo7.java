package controlStatements.forDemos;

public class Demo7 {
    public static void main(String[] args) {
        for (int left = 0, right = 9; left < right; left++, right--) {
            System.out.println("left =" + left + "\tright =" + right);
        }
    }
}
