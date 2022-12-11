package model;

import java.util.Objects;

public class Lecture {
    private int id;
    private String name;

    //other fields are expected

    public Lecture(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return id == lecture.id && Objects.equals(name, lecture.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
