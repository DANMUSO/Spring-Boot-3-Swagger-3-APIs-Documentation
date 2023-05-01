package com.example.dockerappapis.Requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StaffRequest {

    private String name;

    private String email;
    private String phone;
    private String departname;
    private String departcode;
}
