package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo18WriteCharsWithBufferedWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("src/abc.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        LocalDateTime startTime = LocalDateTime.now();
        for (int index = 1; index <100000000 ; index++) {
            bufferedWriter.write("File handling is in progress");
        }
        LocalDateTime endTime = LocalDateTime.now();
        bufferedWriter.close();
        fileWriter.close();
        System.out.println("Write operation complete");
        System.out.println("Time taken to write "+ (endTime.getSecond()-startTime.getSecond()));
    }
}
