package com.example.dockerappapis.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "departments")
public class DepartModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String departcode;


}
