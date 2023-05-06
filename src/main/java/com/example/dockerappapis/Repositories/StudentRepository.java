package com.example.dockerappapis.Repositories;


import com.example.dockerappapis.Models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {

    @Query( value = "select * from students", nativeQuery = true)
    List<StudentModel> getStudents();

}
