package oops.encapsulation;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentPhone;
    private String studentAddress;

    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1);
        student.setStudentName("abc");
        student.setStudentEmail("abc");
        student.setStudentPhone("1234");
        student.setStudentAddress("pune");

       /* System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
        System.out.println(student.getStudentEmail());
        System.out.println(student.getStudentPhone());
        System.out.println(student.getStudentAddress());*/

        System.out.println(student);
    }

}
