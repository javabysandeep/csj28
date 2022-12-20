package controlStatements.switchDemos;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Enter the month in number format");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 1: System.out.println("Jan");break;
            case 2: System.out.println("Feb");break;
            default: System.out.println("invalid input");break;
            case 3: System.out.println("Mar");break;
            case 4: System.out.println("Apr");
            case 5: System.out.println("May");
            case 6: System.out.println("Jun");break;
            case 7: System.out.println("July");
            case 8: System.out.println("Aug");
            case 9: System.out.println("Sept");
            case 10: System.out.println("Oct");
            case 11: System.out.println("Nov");
            case 12: System.out.println("Dec");
        }
        System.out.println("rest of the main method outside of switch");









    }
}
