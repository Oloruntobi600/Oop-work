package org.example;

import java.util.List;

public class School {
    private List<Student> studentList;
    private List<Teacher> teacherList;
    private List<Course> courseList;

    public School(List<Student> studentList, List<Teacher> teacherList, List<Course> courseList) {
        this.studentList = studentList;
        this.teacherList = teacherList;
        this.courseList = courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
     public String enrollStudents(Student student){

     }
     public void assignTeachers (Teacher teacher){

     }
    public String addCourseForStudent (){

    }
    public String removeCourseForStudent (Course course){

    }
    public String addCourseForTeacher (Course course){

    }
    public String addCourseForTeacher (Course course){

    }
    public int assignGrades (Student student){

    }


}
