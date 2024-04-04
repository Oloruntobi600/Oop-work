package org.example;

public class Student extends Person {
    private int studentsId;
    private int studentGrade;

    public Student(String name, int age, int studentsId, int studentGrade) {
        super(name, age);
        this.studentsId = studentsId;
        this.studentGrade = studentGrade;
    }

    public int getStudentsId() {
        return studentsId;
    }

    public void setStudentsIdtId(int studentsId) {
        this.studentsId = studentsId;
    }



    public String studentDetails (Student student){

    }
}
