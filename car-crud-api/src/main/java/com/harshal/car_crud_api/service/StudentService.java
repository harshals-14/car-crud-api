package com.harshal.car_crud_api.service;


import com.harshal.car_crud_api.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();


    public Student addStudent(Student student) {

        students.add(student);
        return student;

    }

    public List<Student> getAllStudents() {

        return students;
    }

    public Student updateStudent(int id,Student updatedStudent) {

        for(Student student :students) {

           if( student.getId() == id)

               student.setName(updatedStudent.getName());
           student.setCourse(updatedStudent.getCourse());
           return student;
        }

        return updatedStudent;
    }

    public String deleteStudent(int id) {

        for(Student student : students) {

            if(student.getId() == id) {

                students.remove(student);
               return "Student deleted";
            }
        }
        return "Student not found";
    }
}
