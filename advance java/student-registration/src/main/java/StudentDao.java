import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    boolean addStudent(Student student) {
        //database logic comes
        String username = "root";
        String password = "root@1234";
        String url = "jdbc:mysql://localhost:3306/cyber_succes";
        int result = 0;
        try {
            Connection connection = DriverManager.getConnection(username, password, url);
            String query = "insert into student(name,email, phone, address) values(?,?,?,?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setString(3, student.getPhone());
            preparedStatement.setString(4, student.getAddress());

            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("exception occurred");
        }
        return result == 0;
    }

    List<Student> getAllStudents(){
        //database logic comes
        String username = "root";
        String password = "root@1234";
        String url = "jdbc:mysql://localhost:3306/cyber_succes";
        int result = 0;
        List<Student> studentList = new ArrayList<Student>();
        try {
            Connection connection = DriverManager.getConnection(username, password, url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                String phone = resultSet.getString(4);
                String address = resultSet.getString(5);

                Student student = Student.builder()
                        .id(id)
                        .name(name)
                        .email(email)
                        .phone(phone)
                        .address(address)
                        .build();
                studentList.add(student);
            }

        } catch (SQLException e) {
            System.out.println("exception occurred");
        }
        return studentList;
    }
}
