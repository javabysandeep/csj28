package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo13ReadFromFileFIS {
    public static void main(String[] args) throws IOException {
        File file = new File("src/abc.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int singleByte = fileInputStream.read();
        while (singleByte !=-1){
            System.out.print((char) singleByte);
            singleByte = fileInputStream.read();
        }
        fileInputStream.close();
    }
}
