package com.example.dockerappapis.DAO;

import com.example.dockerappapis.Models.StudentModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImplementation {

    @PersistenceContext
    private EntityManager manager;
    public List<StudentModel> getAll(){

      return   manager.createNamedQuery("getAllRecord", StudentModel.class).getResultList();
    }

}
