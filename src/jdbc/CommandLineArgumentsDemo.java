package jdbc;

public class CommandLineArgumentsDemo {
    public static void main(String[] commandLineArguments) {
        for (String str:commandLineArguments) {
            System.out.println(str);
        }
    }
}