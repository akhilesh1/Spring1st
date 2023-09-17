package dev.akhilesh.catalog.product.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/hi")
    public String helloAll()
    {
        return "Hi there bhilog";
    }
}
