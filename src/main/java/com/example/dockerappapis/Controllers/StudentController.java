package com.example.dockerappapis.Controllers;

import com.example.dockerappapis.DAO.StudentDAOImplementation;
import com.example.dockerappapis.Models.StudentModel;
import com.example.dockerappapis.Repositories.StudentRepository;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository sRepo;

    @Autowired

    private StudentDAOImplementation sDAO;
    @GetMapping("studentsnative")

    public List<StudentModel> getStudent(){
        //return sRepo.getStudents();
        return sDAO.getAll();
    }

    @PostMapping("students")
    public StudentModel saveStudent(@RequestBody StudentModel studentModel){

        return sRepo.save(studentModel);
    }

}
