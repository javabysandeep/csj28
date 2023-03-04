package jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteFromTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username= "root";
        String password= "Onkar@2002";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String deleteQuery = "DELETE FROM COURSE WHERE COURSE_ID=4";
        statement.executeUpdate(deleteQuery);//DML query: executeUpdate();
        connection.close();
        System.out.println("Record Deleted Successfully");

    }
}
