package com.kernotec.test.rest.controller;

import com.kernotec.test.jpa.entity.TestDb;
import com.kernotec.test.jpa.service.TestDbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private TestDbService service;

    @GetMapping
    List<TestDb> listar(){


        return service.getAll();

    }
}
