package com.kernotec.test.jpa.service;

import com.kernotec.test.jpa.entity.TestDb;
import com.kernotec.test.jpa.repository.TestDbRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDbService {

    @Autowired
    private TestDbRepository repository;


    public List<TestDb> getAll() {
        return repository.findAll();
    }

}
