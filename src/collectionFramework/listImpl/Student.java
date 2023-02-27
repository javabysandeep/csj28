package collectionFramework.listImpl;

public class Student {
    int studentId;
    String studentName;
    String address;

    public Student(int studentId, String studentName, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
