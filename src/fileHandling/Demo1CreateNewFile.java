package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("170223.txt");
        System.out.println(file.createNewFile());

    }
}
