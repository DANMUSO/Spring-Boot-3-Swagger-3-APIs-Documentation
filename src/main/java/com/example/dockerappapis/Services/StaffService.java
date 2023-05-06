package com.example.dockerappapis.Services;

import com.example.dockerappapis.Models.StaffModel;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StaffService {


    //Returning list of staff
    List<StaffModel> getStaff();


    //Saving Staff
    StaffModel saveStaff(StaffModel staffModel);

    //Updating Staff
    StaffModel  updateStaff(StaffModel staffModel);


}
