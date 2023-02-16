package exceptionHandling;

import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        if(age<18){
            throw new InvalidAgeException("Invalid age");
        }else {
            System.out.println("You are eligible for voting");
        }
    }
}
