package eu.ase.ro.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String students() {
        return "/students/index";
    }

    @GetMapping("/students/add")
    public String addEditStudent() {
        return "/students/add";
    }
}
