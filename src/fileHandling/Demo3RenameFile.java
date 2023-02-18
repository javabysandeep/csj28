package fileHandling;

import java.io.File;
import java.io.IOException;

public class Demo3RenameFile {
    public static void main(String[] args) throws IOException {
        File file = new File("170223.txt");
        file.renameTo(new File("180223.txt"));
    }
}
