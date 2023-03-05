package jdbc.statementsBatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertMultipleRecords {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username= "root";
        String password= "Onkar@2002";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String insertQuery1 = "INSERT INTO COURSE(COURSE_NAME, COURSE_DURATION, COURSE_FEES) values('A','1 month',1)";
        String insertQuery2 = "INSERT INTO COURSE(COURSE_NAME, COURSE_DURATION, COURSE_FEES) values('B','2 month',2)";
        String insertQuery3 = "INSERT INTO COURSE(COURSE_NAME, COURSE_DURATION, COURSE_FEES) values('C','3 month',3)";
        String insertQuery4 = "INSERT INTO COURSE(COURSE_NAME, COURSE_DURATION, COURSE_FEES) values('D','4 month',4)";
        String insertQuery5 = "INSERT INTO COURSE(COURSE_NAME, COURSE_DURATION, COURSE_FEES) values('E','5 month',5)";

        statement.addBatch(insertQuery1);
        statement.addBatch(insertQuery2);
        statement.addBatch(insertQuery3);
        statement.addBatch(insertQuery4);
        statement.addBatch(insertQuery5);

        statement.executeBatch();

        connection.close();
        System.out.println(" Multiple Records Inserted Successfully");
    }
}
