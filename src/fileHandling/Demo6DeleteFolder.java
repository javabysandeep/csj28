package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo6DeleteFolder {
    public static void main(String[] args) throws IOException {
        File directory = new File("tempFiles");
        System.out.println(directory.delete());
    }
}
