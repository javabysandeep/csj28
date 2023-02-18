package fileHandling;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class Demo9GetSetPermissions {
    public static void main(String[] args) throws IOException {
        File file = new File("170223.txt");
        System.out.println("Read permission "+file.canRead());
        System.out.println("Write permission "+file.canWrite());
        System.out.println("Execute permission "+file.canExecute());

        //change the permission
        file.setWritable(true);
        System.out.println("Last modified time "+ file.lastModified());


    }
}
