package com.example.dockerappapis.Repositories;

import com.example.dockerappapis.Models.ClassModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassModel, Long> {
}
