package collectionFramework.setImpl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course implements Comparable<Course> {
    private int courseId;
    private String courseName;
    private String courseDuration;
    private String courseContent;
    private String courseInstructor;
    private int courseFees;

    @Override
    public int compareTo(Course course) {
        return course.courseFees - this.courseFees;
//        return this.courseId - course.courseId;
        //return this.courseName.compareTo(course.courseName);
    }
}
