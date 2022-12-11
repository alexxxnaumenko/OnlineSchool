import utils.Counter;
import model.Course;
import model.Lecture;
import model.Teacher;
import service.CourseService;
import service.LectureService;
import service.TeacherService;

import java.util.Arrays;
import java.util.HashSet;

public class Main {

    private final static CourseService courseService = new CourseService();
    private final static LectureService lectureService = new LectureService();
    private final static TeacherService teacherService = new TeacherService();

    public static void main(String[] args) {

        Teacher javaTeacher = teacherService.buildTeacher(1, "Oleksii", "Naumenko");

        Course java = courseService.buildCourse(1, "Java");
        java.setTeacher(javaTeacher);

        Course cplusplus = courseService.buildCourse(2, "C++");
        Lecture lecture1 = lectureService.buildLecture(1, "Introduction");
        Lecture lecture2 = lectureService.buildLecture(2, "Primitives");
        Lecture lecture3 = lectureService.buildLecture(3, "OOP");

        courseService.addLecturesToCourse(cplusplus, new HashSet<>(Arrays.asList(lecture1, lecture2, lecture3)));
        Counter.countAllEntities(Arrays.asList(java, cplusplus));
    }
}
