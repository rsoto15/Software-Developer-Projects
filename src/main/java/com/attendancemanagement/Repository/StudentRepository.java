package com.attendancemanagement.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.attendancemanagement.Student;

@Repository
public class StudentRepository {

    private List<Student> studentsList = new ArrayList<>();

    public Student getStudent(int index) {
        return studentsList.get(index);
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public void updateStudent(Student student, int index) {
        studentsList.set(index, student);
    }

    public List<Student> getStudents() {
        return studentsList;
    }
    
}
