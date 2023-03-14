package jdbc.cashbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/cashbook";
        String username = "root";
        String password = "Onkar@2002";
        Connection connection = null;
        try {
             connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Error in connection");
        }
        return connection;
    }
}
