package com.example.springboot.run;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RunController {

    List<Run> findAll() {
        return null;
    }
}
