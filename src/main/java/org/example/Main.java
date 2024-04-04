package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person tobi = new Person("tobi", 20);
        Course English = new Course("English", 10, "Toba");
        Student Tomiwa = new Student("tomiwa", 30, 4, 100);
        Teacher bolarinwa = new Teacher("bolarinwa", 30, 4);

        List<Person> personList = new ArrayList<>();
        personList.add(tobi);
        List<Course> courseList = new ArrayList<>();
        courseList.add(English);
        List<Student> studentList = new ArrayList<>();
        studentList.add(Tomiwa);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(bolarinwa);

        }
    }
