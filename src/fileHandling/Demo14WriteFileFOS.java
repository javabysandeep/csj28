package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo14WriteFileFOS {
    public static void main(String[] args) throws IOException {
        File file = new File("src/xyz.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        LocalDateTime startTime = LocalDateTime.now();
        for (int index = 1; index <10000000 ; index++) {
            fileOutputStream.write(97);
        }
        fileOutputStream.close();
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Successfully written to the file");
        System.out.println("Time taken to write "+(endTime.getSecond()-startTime.getSecond()));

    }
}
