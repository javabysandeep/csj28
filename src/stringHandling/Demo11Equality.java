package stringHandling;

public class Demo11Equality {
    public static void main(String[] args) {
        String str1 = new String("Admin");//str1 points to an object from Heap
        String str2 = "Admin";//str2 points to an object from SCP
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

        String str3 = "admin";
        System.out.println(str1.equalsIgnoreCase(str3));//true


    }
}
