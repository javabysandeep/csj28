package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo7GetFilePath {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/sandeep/Documents/training/csj28/Demo1CreateNewFile.java");
        System.out.println("File relative path "+file.getPath());
        System.out.println("File Absolute path "+file.getAbsolutePath());
        System.out.println("File size "+file.length());

    }
}
