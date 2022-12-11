package service;

import model.Course;
import model.Lecture;

import java.util.Set;

public class CourseService {

    public CourseService() {
    }

    public void addLectureToCourse(Course course, Lecture lecture) {
        course.getLectures().add(lecture);
    }

    public void addLecturesToCourse(Course course, Set<Lecture> newLectures) {
        Set<Lecture> lectures = course.getLectures();
        lectures.addAll(newLectures);
    }

    public Course buildCourse(int id, String name){
        return new Course(id, name);
    }
}
