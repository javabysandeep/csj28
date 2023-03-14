package service;

import dao.ExpenseDao;
import entities.Expense;

public class ExpenseService {
    public void addExpense(Expense expense) {
        ExpenseDao expenseDao = new ExpenseDao();
        expenseDao.addExpense(expense);
    }
}
