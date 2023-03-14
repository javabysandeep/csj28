import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class StudentController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");

        Student student = Student.builder()
                .name(name)
                .email(email)
                .phone(phone)
                .address(address)
                .build();

        StudentService studentService = new StudentService();

        boolean isAdded = studentService.addStudent(student);
        PrintWriter writer = resp.getWriter();
        if (isAdded) {
            writer.println("<h1> Student Registered Successfully </h1>");
        } else {
            writer.println("<h1> Student Registered failed </h1>");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("registet.html");
            requestDispatcher.include(req, resp);
        }
    }
}
