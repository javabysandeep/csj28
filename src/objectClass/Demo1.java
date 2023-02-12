package objectClass;

public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student(1,"abc","pune");
        System.out.println(student.getClass().getName());
        int hashCodeValue = student.hashCode();
        System.out.println(Integer.toHexString(hashCodeValue));
        System.out.println(hashCodeValue);
        System.out.println(student.toString());

       /* System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));*/
    }
}
