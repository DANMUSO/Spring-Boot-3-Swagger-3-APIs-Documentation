package com.example.dockerappapis.Controllers;


import com.example.dockerappapis.Models.DepartModel;
import com.example.dockerappapis.Repositories.DepartRepository;
import com.example.dockerappapis.Responses.DepartResponse;
import com.example.dockerappapis.Services.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartService departService;

    @Autowired
    private DepartRepository departRepository;
    @GetMapping("departments")
    public List<DepartModel> getDepartment(){

        return departService.getDerpartment();
    }
    @PostMapping("createdepartment")
    public DepartModel saveDepartment(@RequestBody DepartModel departModel){
        return departService.SaveDepartment(departModel);
    }

    @PutMapping("updatedepart/{id}")
    public DepartModel updateDepartment(@PathVariable Long id, @RequestBody DepartModel departModel){
        departModel.setId(id);
        return departService.SaveDepartment(departModel);
    }

    @GetMapping("getdepart")

    public Optional<DepartModel> getSingleDepart(@RequestParam Long id){
        return departService.getSingleDepart(id);
    }

    public List<DepartResponse> getDepart(){
       List<DepartModel> depts = departRepository.findAll();

        System.out.println(depts);
        List<DepartResponse> list = new ArrayList<>();
        depts.forEach( d -> {
            DepartResponse departResponse = new DepartResponse();
            departResponse.setId(d.getId());
            departResponse.setName(d.getName());
            departResponse.setDepartcode(d.getDepartcode());

            list.add(departResponse);
        });

        return list;
    }
}
