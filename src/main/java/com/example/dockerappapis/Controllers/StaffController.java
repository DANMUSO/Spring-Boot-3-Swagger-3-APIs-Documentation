package com.example.dockerappapis.Controllers;

import com.example.dockerappapis.Models.DepartModel;
import com.example.dockerappapis.Models.StaffModel;
import com.example.dockerappapis.Repositories.DepartRepository;
import com.example.dockerappapis.Repositories.StaffRepository;
import com.example.dockerappapis.Requests.StaffRequest;
import com.example.dockerappapis.Services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffController {


    @Autowired
    private StaffService staffService;

    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private DepartRepository departRepository;

    @GetMapping("/staff")
    public List<StaffModel > getStaff(){
        return staffService.getStaff();
    }

    @PostMapping("createstaff")

    public StaffModel saveStaff(@RequestBody StaffRequest sRequest){
        DepartModel dept = new DepartModel();
        dept.setName(sRequest.getDepartname());
        dept.setDepartcode(sRequest.getDepartcode());
        dept = departRepository.save(dept);

       StaffModel staffModel = new StaffModel(sRequest);
       staffModel.setDepartModel(dept);

        System.out.println(dept.getId());
        System.out.println(dept.getDepartcode());
        staffModel = staffRepository.save(staffModel);

        return staffModel;




    }

    @PutMapping("updatestaff/{id}")
    public StaffModel updateStaff(@PathVariable Long id, @RequestBody StaffModel staffModel){
        staffModel.setId(id);
        return staffService.updateStaff(staffModel);
    }
}


