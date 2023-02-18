package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo5DeleteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("180223.txt");
        System.out.println(file.delete());

    }
}
