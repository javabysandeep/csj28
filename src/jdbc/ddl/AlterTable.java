package jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "Onkar@2002";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
       String alterTableQuery = "ALTER TABLE COURSE MODIFY COLUMN COURSE_ID INT auto_increment";
        //String alterTableQuery = "ALTER TABLE COURSE ADD PRIMARY KEY(COURSE_ID)";
        // true: if first object is resultSet otherwise false
        boolean isTableCreated = statement.execute(alterTableQuery);
        connection.close();
        System.out.println("Table is altered ");
    }
}
