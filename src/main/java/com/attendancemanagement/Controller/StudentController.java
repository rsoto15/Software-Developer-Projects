package com.attendancemanagement.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.attendancemanagement.Constants;
import com.attendancemanagement.Student;
import com.attendancemanagement.Repository.StudentRepository;
import com.attendancemanagement.Service.StudentService;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String studentForm(Model model, @RequestParam(required = false) String id) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "form";
    }

    @PostMapping("/handleSubmit") 
    public String submitStudent(@Valid Student student, BindingResult result) {
        if (result.hasErrors()) return "form";
        studentService.submitForm(student);        
        return "redirect:/students";
    }

    @GetMapping("/students")
    public String getStudent(Model model) {        
        model.addAttribute("students", studentService.getStudents());
        return "students";
    }

}
