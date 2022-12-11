package utils;

import model.Course;

import java.util.List;

public class Counter {

    public static void countAllEntities(List<Course> courses){

        int courseCounter = courses.size();
        int studentCounter = 0;
        int lectureCounter = 0;
        int teacherCounter = 0;

        for (Course course : courses) {
            lectureCounter += course.getLectures().size();
            studentCounter += course.getStudents().size();
            if (course.getTeacher() != null){
                teacherCounter++;
            }
        }

        System.out.println("courseCounter = " + courseCounter);
        System.out.println("studentCounter = " + studentCounter);
        System.out.println("lectureCounter = " + lectureCounter);
        System.out.println("teacherCounter = " + teacherCounter);

    }
}
