package controlStatements.ifElse;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Enter the cost and quantity");
        Scanner scanner = new Scanner(System.in);
        int cost = scanner.nextInt();
        int quantity = scanner.nextInt();
        int billAmount = cost * quantity;
        float discountAmount = 0f;
        if(billAmount > 10000){
            discountAmount = billAmount * 0.10f;
        }
        float finalBillAmount = billAmount - discountAmount;
        System.out.println("Total bill value "+billAmount);
        System.out.println("Discount "+discountAmount);
        System.out.println("Final payable "+finalBillAmount);

    }
}
