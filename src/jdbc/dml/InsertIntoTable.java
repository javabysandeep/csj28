package jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertIntoTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username= "root";
        String password= "Onkar@2002";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String insertQuery = "INSERT INTO COURSE(COURSE_NAME, COURSE_DURATION, COURSE_FEES) VALUES('Advance Java','5 months',6000)";
        statement.executeUpdate(insertQuery);//DML query: executeUpdate();
        connection.close();
        System.out.println("Record Inserted Successfully");

    }
}
