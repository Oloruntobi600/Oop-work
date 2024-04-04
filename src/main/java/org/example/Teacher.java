package org.example;

public class Teacher extends Person{
    private int teachersId;

    public Teacher(String name, int age, int teachersId) {
        super(name, age);
        this.teachersId = teachersId;
    }

    public int getTeachersId() {
        return teachersId;
    }

    public void setTeachersId(int teachersId) {
        this.teachersId = teachersId;
    }
    public String teachersDetails (Teacher teacher){

    }
}
