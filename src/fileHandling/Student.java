package fileHandling;

import java.io.Serializable;

public class Student implements Serializable {
    int rollNumber;
    String name;
    transient String address;//donot save this filed in the file

    public Student(int rollNumber, String name, String address) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.address = address;
    }


    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
