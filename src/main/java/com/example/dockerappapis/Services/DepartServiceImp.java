package com.example.dockerappapis.Services;

import com.example.dockerappapis.Models.DepartModel;
import com.example.dockerappapis.Models.StaffModel;
import com.example.dockerappapis.Repositories.DepartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartServiceImp implements DepartService
{
    @Autowired

    private DepartRepository dRepository;

    @Override
    public List<DepartModel> getDerpartment() {
        return dRepository.findAll();
    }

    @Override
    public DepartModel SaveDepartment(DepartModel departModel) {
        return dRepository.save(departModel);
    }

    @Override
    public DepartModel UpdateDepartment(DepartModel departModel) {
        return dRepository.save(departModel);
    }

    @Override
    public Optional<DepartModel> getSingleDepart(Long id) {
        return dRepository.findById(id);
    }
}
