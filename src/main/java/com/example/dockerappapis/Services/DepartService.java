package com.example.dockerappapis.Services;

import com.example.dockerappapis.Models.DepartModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface DepartService {

    List<DepartModel> getDerpartment();


    DepartModel SaveDepartment (DepartModel departModel);

    DepartModel UpdateDepartment(DepartModel departModel);

    Optional<DepartModel> getSingleDepart(Long id);
}
