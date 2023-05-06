package com.example.dockerappapis.Controllers;

import com.example.dockerappapis.Models.ClassModel;
import com.example.dockerappapis.Models.StudentModel;
import com.example.dockerappapis.Repositories.ClassRepository;
import com.example.dockerappapis.Repositories.StudentRepository;
import com.example.dockerappapis.Requests.ClassRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

    @Autowired
    private ClassRepository cRepo;

    @Autowired
    private StudentRepository sRepo;



    @PostMapping("class")

    public String saveClass(@RequestBody ClassRequest cRequest){

        ClassModel classModel = new ClassModel(cRequest);
        classModel = cRepo.save(classModel);

        for (String s: cRequest.getStudent()){
            StudentModel studentModel = new StudentModel();
            studentModel.setName(s);
            studentModel.setEmail(s);
            studentModel.setPhone(s);
            sRepo.save(studentModel);
        }

        return "Record saved successfully!";


    }
}
