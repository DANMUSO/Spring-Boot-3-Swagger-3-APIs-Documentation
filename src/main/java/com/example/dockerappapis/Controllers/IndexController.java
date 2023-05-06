package com.example.dockerappapis.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

   @GetMapping("/index")
    public String displayPage(){
        return "displayPage";
    }

}
