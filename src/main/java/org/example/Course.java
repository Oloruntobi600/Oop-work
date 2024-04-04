package org.example;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private int courseId;
    private String teachersId;

    public Course(String courseName, int courseId, String courseTeacher) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.teachersId = courseTeacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
    public List<String> courseList = new ArrayList<>();

    public String courseDetails (Course course){
    courseList.add(course)
    }
}
