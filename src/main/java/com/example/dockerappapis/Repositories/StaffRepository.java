package com.example.dockerappapis.Repositories;

import com.example.dockerappapis.Models.StaffModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StaffRepository extends JpaRepository<StaffModel, Long> {

}
