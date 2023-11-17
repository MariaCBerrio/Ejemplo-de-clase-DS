package com.udea.clase19.controllers;
import com.udea.clase19.entity.Student;
import com.udea.clase19.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class FrontController {
    @Autowired
    StudentService studentService;
    @GetMapping("/students")
    public String student(Model model){
        List<Student> students = studentService.getStudents();
        model.addAttribute("students", students);
        return "student";
    }
    @GetMapping("/students/newStudent")
    public String newStudent(Model model){
        model.addAttribute("students", new Student());
        return "newStudent";
    }
}

