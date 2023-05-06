package com.example.dockerappapis.Requests;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClassRequest {

    private String name;
    private String classcode;

    private List<String> student;
}
