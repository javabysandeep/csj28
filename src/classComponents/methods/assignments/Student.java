package classComponents.methods.assignments;

public class Student {
    int rollNumber;
    String name;
    String address;
    int phoneNumber;

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "JOhn";
        student1.address = "Pune";
        student1.phoneNumber = 12345;

        Student student2 = new Student();
        student2.rollNumber = 2;
        student2.name = "Sam";
        student2.address = "Pimpri";
        student2.phoneNumber = 787889;


        //print the objects

        System.out.println(student1.rollNumber + "\t" +
                student1.name + "\t" +
                student1.phoneNumber + "\t" +
                student1.address);


        System.out.println(student2.rollNumber + "\t" +
                student2.name + "\t" +
                student2.phoneNumber + "\t" +
                student2.address);

    }
}
