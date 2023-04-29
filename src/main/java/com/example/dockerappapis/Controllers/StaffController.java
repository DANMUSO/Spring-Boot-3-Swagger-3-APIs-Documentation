package com.example.dockerappapis.Controllers;

import com.example.dockerappapis.Models.StaffModel;
import com.example.dockerappapis.Services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {


    @Autowired
    private StaffService staffService;

    @GetMapping("/staff")
    public List<StaffModel > getStaff(){
        return staffService.getStaff();
    }

    @PostMapping("createstaff")

    public StaffModel saveStaff(@RequestBody StaffModel staffModel){
        return staffService.saveStaff(staffModel);
    }

    @PutMapping("updatestaff/{id}")
    public StaffModel updateStaff(@PathVariable Long id, @RequestBody StaffModel staffModel){
        staffModel.setId(id);
        return staffService.updateStaff(staffModel);
    }
}


