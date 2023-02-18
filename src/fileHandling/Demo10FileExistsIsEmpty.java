package fileHandling;

import java.io.File;

public class Demo10FileExistsIsEmpty {
    public static void main(String[] args) {
        File file = new File("170223.txt");
        System.out.println("File exists "+file.exists());
    }
}
