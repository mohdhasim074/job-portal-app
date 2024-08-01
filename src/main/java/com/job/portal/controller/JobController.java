package com.job.portal.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/job")
public class JobController {
//@Autowired
// private    JpaRepository repository;

    @GetMapping("/home")
    public String index() {
        return "<h1> welcome to the Job Application page </h1>";
    }

}
