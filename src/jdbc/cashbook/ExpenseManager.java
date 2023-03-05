package jdbc.cashbook;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {

    void addExpense(Expense expense) throws SQLException {
        String insertExpenseQuery = "INSERT INTO EXPENSE(title, amount, date, notes) values(?,?,?,?)";

        Connection connection = ConnectionUtil.getConnection();

        PreparedStatement preparedStatement = connection.prepareStatement(insertExpenseQuery);

        preparedStatement.setString(1,expense.getExpenseTitle());
        preparedStatement.setInt(2,expense.getExpenseAmount());
        preparedStatement.setDate(3,expense.getExpenseDate());
        preparedStatement.setString(4,expense.getNotes());

        preparedStatement.executeUpdate();

        System.out.println("Expense added in the table");

    }

    void editExpense(Expense expense){}

    void deleteExpense(int expenseId){}

    List<Expense> getAllExpenses() throws SQLException{
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from expense");
        List<Expense> expenseList = new ArrayList<>();
        while (resultSet.next()){
            Expense expense = new Expense();
            expense.setExpenseId(resultSet.getInt(1));
            expense.setExpenseTitle(resultSet.getString(2));
            expense.setExpenseAmount(resultSet.getInt(3));
            expense.setExpenseDate(resultSet.getDate(4));
            expense.setNotes(resultSet.getString(5));

            expenseList.add(expense);
        }
        return expenseList;
    }

}
