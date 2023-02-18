package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo16ReadCharsFileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("src/notes.txt");
        FileReader fileReader = new FileReader(file);
        int ch = fileReader.read();
        while (ch!=-1){
            System.out.print((char)ch);
            ch = fileReader.read();
        }
        fileReader.close();
    }
}
