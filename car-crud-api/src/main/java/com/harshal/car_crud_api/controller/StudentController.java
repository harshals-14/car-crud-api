package com.harshal.car_crud_api.controller;

import com.harshal.car_crud_api.model.Student;
import com.harshal.car_crud_api.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {

        return studentService.addStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {

        return studentService.getAllStudents();
    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent ) {

        return studentService.updateStudent(id,updatedStudent);

    }
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id) {

        return studentService.deleteStudent(id);
    }
}
