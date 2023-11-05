package com.StudentRegistration.StudentRegistration.Controllers;

import com.StudentRegistration.StudentRegistration.StudentEntity.Student;
import com.StudentRegistration.StudentRegistration.StudentEntity.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(path = "/")
    public String addNewStudentPage(){
        return "student-registration";
    }

    @PostMapping(path = "/")
    public String userRegistration(@ModelAttribute Student student, Model model){
        System.out.println(student.toString());

        studentRepository.save(student);
        return "student-registration";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Student> getAllStudents(@ModelAttribute Student student){
        for(Student it : studentRepository.findAll()){
            System.out.println(it.getSname() + " " + it.getRollno());
        }
        return studentRepository.findAll();
    }
}