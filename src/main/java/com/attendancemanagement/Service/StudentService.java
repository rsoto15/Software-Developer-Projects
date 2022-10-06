package com.attendancemanagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.attendancemanagement.Constants;
import com.attendancemanagement.Student;
import com.attendancemanagement.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    
    public Student getStudent(int index) {
        return studentRepository.getStudent(index);
    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void updateStudent(Student student, int index) {
        studentRepository.updateStudent(student, index);
    }

    public List<Student> getStudents() {
        return studentRepository.getStudents();
    }

    public int getStudentIndex(String id) {
        for (int i = 0; i < getStudents().size(); i++) {
            if (getStudents().get(i).getId().equals(id)) return i;
        }
        return Constants.NOT_FOUND;
    }

    public Student getStudentById(String id) {
        int index = getStudentIndex(id);
        return index == Constants.NOT_FOUND ? new Student() : getStudent(index);
        
    }

    public void submitForm(Student student) {

        int index = getStudentIndex(student.getId());
        if (index == Constants.NOT_FOUND) {
            addStudent(student);
        } else {
            updateStudent(student, index);
        }

    }
}
