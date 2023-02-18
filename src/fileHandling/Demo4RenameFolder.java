package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo4RenameFolder {
    public static void main(String[] args) throws IOException {
        File directory = new File("temporaryFiles");
        directory.renameTo(new File("tempFiles"));
    }
}
