package jdbc.dml;

import java.sql.*;
import java.util.Enumeration;

public class InsertIntoTableDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       //steps to connect to the database
        //step1: load the Driver class in the memory
        Class.forName("com.mysql.cj.jdbc.Driver");

        //step2: Driver registration with DriverManager.
            // Once the Driver class is loaded in the memory then its static block will be executed
            // Instance of the Driver class will be passed to the DriverManager.registerDriver(new Driver());

        // Step3: Get Connection
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "Onkar@2002";
        Connection connection = null;
        try {
             connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            int update = statement.executeUpdate("INSERT INTO STUDENT VALUES(2,'Raju Shrivastva',898989)");
            System.out.println("Record Inserted Successfully");

        } catch (SQLException e) {
            System.out.println("Invalid connection details");
        }
        finally {
            connection.close();
        }

    }
}
