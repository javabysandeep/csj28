package classComponents.methods.assignments;

import java.util.Scanner;

public class GradingApp {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = scanner.nextInt();
        System.out.println(getGrade(marks));
    }

    private static String getGrade(int marks) {
        /*
        * Marks        Grade
        91-100         A
        71-90          B
        51-70          C
        35-50          D
        <=35          Fail
        *
        * */
        String grade = "FAIL";
        if(marks >=91 && marks <=100){
         grade = "A";
        } else if (marks >=71 && marks <=90) {
            grade = "B";
        }else if (marks >=51 && marks <=70) {
            grade = "C";
        }else if (marks >=35 && marks <=50) {
            grade = "D";
        } else if(marks < 35){
            grade = "FAIL";
        }
        return  grade;
    }

}
