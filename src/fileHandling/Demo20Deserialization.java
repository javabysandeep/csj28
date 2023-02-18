package fileHandling;

import java.io.*;

public class Demo20Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //De-Serialization :
        File file = new File("student.dat");
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student)objectInputStream.readObject();
        System.out.println(student);
        objectInputStream.close();
        fileInputStream.close();

    }
}
