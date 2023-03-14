package jdbc.courseRegistration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseRegistrationDemo {
    public static void main(String[] args) throws SQLException {
        //accept the details from user for course
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course name");
        String courseName = scanner.nextLine();

        System.out.println("Enter the course Duration");
        String courseDuration = scanner.nextLine();

        System.out.println("Enter the course Fees");
        int courseFees = scanner.nextInt();

        String url = "jdbc:mysql://localhost:3306/cyber_success";
        String username = "root";
        String password = "Onkar@2002";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        String insertQuery = "INSERT INTO COURSE(COURSE_NAME, COURSE_DURATION, COURSE_FEES) VALUES('"+courseName+"',"+"'"+courseDuration+"','"+courseFees+"')";
        int executeUpdate = statement.executeUpdate(insertQuery);
        connection.close();
        System.out.println("Course registered");
    }
}
