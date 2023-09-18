package dev.akhilesh.catalog.product.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//rest controller meaning this will always return response body unlike simple controller
public class FirstController {

    @GetMapping("/hi")
    public String helloAll()
    {
        return "Hi there bhilog kaise ho 2";
    }
}
