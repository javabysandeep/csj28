package objectClass;

public class EqualsMethodDemo {
    public static void main(String[] args) {
        Student student1 = new Student(1,"abc","pune");
        Student student2 = new Student(1,"abc","pune");
        System.out.println(student1==student2);//false
        System.out.println(student1.equals(student2));//false
    }
}
