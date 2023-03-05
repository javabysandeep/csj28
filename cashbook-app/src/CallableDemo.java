import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableDemo {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/cashbook";
        String username = "root";
        String password = "Onkar@2002";

        Connection connection = DriverManager.getConnection(url, username, password);
       //call the stored procedure : to call the stored procedure we use callable statement
        CallableStatement callableStatement = connection.prepareCall("call bulkAddExpenses()");
        callableStatement.execute();
        System.out.println("Stored procedure called from java app");

    }
}
