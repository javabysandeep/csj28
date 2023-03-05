package dao;

import entities.Expense;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExpenseDao {
    public void addExpense(Expense expense) {
        String url = "jdbc:mysql://localhost:3306/cashbook";
        String username = "root";
        String password = "Onkar@2002";
        Connection connection = null;
        try {
             connection = DriverManager.getConnection(url, username, password);
             String insertQuery = "INSERT INTO EXPENSE(title, amount, date, notes) values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,expense.getTitle());
            preparedStatement.setInt(2, expense.getAmount());
            preparedStatement.setDate(3, expense.getDate());
            preparedStatement.setString(4,expense.getNotes());
            preparedStatement.executeUpdate();
            System.out.println("Expense added in the table");
        } catch (SQLException e) {
            System.out.println("connection issue");
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("error in closing the connection");
            }
        }

    }
}
