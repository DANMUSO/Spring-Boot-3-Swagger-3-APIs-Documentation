package com.example.dockerappapis.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "staffs")
public class StaffModel {

    @Id

    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;


    private String name;

    private String phone;

    private String email;

}
