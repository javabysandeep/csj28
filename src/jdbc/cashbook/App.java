package jdbc.cashbook;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        ExpenseManager expenseManager = new ExpenseManager();

       // expenseManager.addExpense(acceptExpense());
        List<Expense> allExpenses = expenseManager.getAllExpenses();
        for (Expense expense:allExpenses) {
            System.out.println(expense);
        }
    }

    public static Expense acceptExpense() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the expense title");
        String expenseTitle = scanner.nextLine();

        System.out.println("Enter the expense amount");
        int expenseAmount = scanner.nextInt();

       /* System.out.println("Enter the expense Date");
        Date expenseDate = Date.valueOf(scanner.nextLine());*/

        System.out.println("Enter the expense note");
        String expenseNote = scanner.nextLine();

        Expense expense = new Expense();
        expense.setExpenseTitle(expenseTitle);
        expense.setExpenseAmount(expenseAmount);
       // expense.setExpenseDate(expenseDate);
        expense.setNotes(expenseNote);

        return expense;
    }
}
