package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo19WriteObjectObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //Serialization :
        Student student  = new Student(1,"Sachin","Pune");

        File file = new File("student.dat");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);

        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Successfully object is written");
    }
}
