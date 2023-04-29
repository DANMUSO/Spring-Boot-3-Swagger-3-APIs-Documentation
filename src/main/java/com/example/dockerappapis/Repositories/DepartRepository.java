package com.example.dockerappapis.Repositories;

import com.example.dockerappapis.Models.DepartModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartRepository extends JpaRepository<DepartModel, Long> {
}
