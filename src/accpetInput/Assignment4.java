package accpetInput;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        System.out.println("Enter your name, roll number and field of interest");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String rollNumber = scanner.next();
        String fieldOfInterest = scanner.next();
        System.out.println("Hey, my name is "+name+" and my roll number is "+rollNumber);
        System.out.println("My field of interest "+fieldOfInterest);

    }
}
