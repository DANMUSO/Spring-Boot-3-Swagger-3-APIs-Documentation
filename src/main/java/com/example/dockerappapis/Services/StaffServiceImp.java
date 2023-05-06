package com.example.dockerappapis.Services;

import com.example.dockerappapis.Models.StaffModel;
import com.example.dockerappapis.Repositories.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImp implements StaffService{

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public List<StaffModel> getStaff() {
        return staffRepository.findAll();
    }

    @Override
    public StaffModel saveStaff(StaffModel staffModel) {
        return staffRepository.save(staffModel);
    }

    @Override
    public StaffModel updateStaff(StaffModel staffModel) {
        return staffRepository.save(staffModel);
    }

}
