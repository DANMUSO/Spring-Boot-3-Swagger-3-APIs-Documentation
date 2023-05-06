package com.example.dockerappapis.Models;

import com.example.dockerappapis.Requests.ClassRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table( name = "classes")
@Entity
public class ClassModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String classcode;

    public ClassModel(ClassRequest cRequest) {
        this.name = cRequest.getName();
        this.classcode = cRequest.getClasscode();
    }
}
