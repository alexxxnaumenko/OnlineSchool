package service;

import model.Lecture;

public class LectureService {
    public Lecture buildLecture(int id, String name) {
        return new Lecture(id, name);
    }
}
