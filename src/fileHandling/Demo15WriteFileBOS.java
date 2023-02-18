package fileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo15WriteFileBOS {
    public static void main(String[] args) throws IOException {
        File file = new File("src/xyz.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

        LocalDateTime startTime = LocalDateTime.now();
        for (int index = 1; index <10000000 ; index++) {
            bufferedOutputStream.write(97);
        }

        bufferedOutputStream.close();
        fileOutputStream.close();
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Successfully written to the file");
        System.out.println("Time taken to write "+(endTime.getSecond()- startTime.getSecond()));

    }
}
