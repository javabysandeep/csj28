import java.util.List;

public class StudentService {
    boolean addStudent(Student student){
        StudentDao studentDao = new StudentDao();
        return studentDao.addStudent(student);
    }

    List<Student> getAllStudents(){
        StudentDao studentDao = new StudentDao();
        return studentDao.getAllStudents();
    }
}
