package com.secondexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class seconddemoSpringBootController {
    @RequestMapping("/seconddemoSpringBoot")
    public String seconddemoSpringBoot(){
        return "seconddemoSpringBoot";
    }
}
