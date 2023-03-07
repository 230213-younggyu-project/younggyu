package com.korit.younggyu.plant.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlantController {
    @GetMapping("/plant/all")
    public String index() {
        return "project";
    }
}
