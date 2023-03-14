import controller.ExpenseController;
import entities.Expense;

import java.sql.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Expense expense = acceptExpenseDetailsFromUser();
        ExpenseController expenseController = new ExpenseController();
        expenseController.addExpense(expense);
    }

    private static Expense acceptExpenseDetailsFromUser() {
        //accept input: expense title, amount, notes, date
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter expense title");
        String title = scanner.nextLine();
        System.out.println("enter expense amount");
        int amount = scanner.nextInt();
        /*System.out.println("enter expense date");
        Date date = Date.valueOf(scanner.nextLine());*/
        System.out.println("enter expense notes");
        String notes = scanner.nextLine();
        Expense expense = new Expense();
        expense.setTitle(title);
        expense.setAmount(amount);
       // expense.setDate(date);
        expense.setNotes(notes);
        return expense;
    }
}