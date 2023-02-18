package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo2CreateNewFolder {
    public static void main(String[] args) throws IOException {
        File directory = new File("temporaryFiles");
        System.out.println(directory.mkdir());

    }
}
