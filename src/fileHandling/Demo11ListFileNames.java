package fileHandling;

import java.io.File;

public class Demo11ListFileNames {
    public static void main(String[] args) {
        File folder = new File("src/fileHandling");
        String[] fileNames = folder.list();
        for (String fileName : fileNames) {
            System.out.println(fileName);
        }
    }
}
