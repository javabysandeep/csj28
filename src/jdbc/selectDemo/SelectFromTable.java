package jdbc.selectDemo;

import java.sql.*;

public class SelectFromTable {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "Onkar@2002";
        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String query = "SELECT * FROM COURSE";
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            System.out.println(resultSet.getInt("COURSE_ID")+"\t" +
                    resultSet.getString("COURSE_NAME")+"\t"+
                    resultSet.getString("COURSE_DURATION")+"\t"+
                    resultSet.getInt("COURSE_FEES"));
        }
        connection.close();
    }
}
