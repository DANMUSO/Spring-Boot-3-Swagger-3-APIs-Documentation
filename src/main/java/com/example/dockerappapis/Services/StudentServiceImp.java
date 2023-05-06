package com.example.dockerappapis.Services;

import com.example.dockerappapis.Models.StudentModel;
import com.example.dockerappapis.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepository sRepo;
    @Override
    public StudentModel saveStudent(StudentModel studentModel) {
        return sRepo.save(studentModel);
    }
}
