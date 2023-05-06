package com.example.dockerappapis.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "students")
@NoArgsConstructor
@NamedNativeQuery(name = "getAllRecord", query = "select * from students", resultClass = StudentModel.class)
public class StudentModel {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;
    private String phone;

}
