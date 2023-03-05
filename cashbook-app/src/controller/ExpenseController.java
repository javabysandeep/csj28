package controller;

import entities.Expense;
import service.ExpenseService;

public class ExpenseController {
    public void addExpense(Expense expense) {
        ExpenseService expenseService = new ExpenseService();
        expenseService.addExpense(expense);
    }
}
