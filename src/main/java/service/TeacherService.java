package service;

import model.Teacher;

public class TeacherService {
    public Teacher buildTeacher(int id, String firstName, String lastName) {
        return new Teacher(id, firstName, lastName);
    }
}
