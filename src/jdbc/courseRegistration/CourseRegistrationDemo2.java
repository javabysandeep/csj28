package jdbc.courseRegistration;

import java.sql.*;
import java.util.Scanner;

public class CourseRegistrationDemo2 {
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
        String insertQuery = "INSERT INTO COURSE(COURSE_NAME, COURSE_DURATION, COURSE_FEES) VALUES(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1,courseName);
        preparedStatement.setString(2,courseDuration);
        preparedStatement.setInt(3,courseFees);

        int executeUpdate = preparedStatement.executeUpdate();
        connection.close();
        System.out.println("Course registered");
    }
}
