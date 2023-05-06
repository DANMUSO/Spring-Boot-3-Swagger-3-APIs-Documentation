package com.example.dockerappapis.Models;

import com.example.dockerappapis.Requests.StaffRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "staffs")
@NoArgsConstructor
public class StaffModel {

    @Id

    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;


    private String name;

    private String phone;

    private String email;

    @JoinColumn(name = "department_id")
    @OneToOne
    private DepartModel departModel;

    public StaffModel(StaffRequest req){

        this.name = req.getName();
        this.email = req.getEmail();
        this.phone = req.getPhone();
    }


}
