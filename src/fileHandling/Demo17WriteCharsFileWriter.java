package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo17WriteCharsFileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("src/abc.txt");
        System.out.println("Create file "+file.createNewFile());
        FileWriter fileWriter = new FileWriter(file);
        LocalDateTime startTime = LocalDateTime.now();
        for (int index = 1; index <100000000 ; index++) {
            fileWriter.write("File handling is in progress");
        }
        LocalDateTime endTime = LocalDateTime.now();
        fileWriter.close();
        System.out.println("Write operation complete");
        System.out.println("Time taken to write "+ (endTime.getSecond()-startTime.getSecond()));
    }
}
