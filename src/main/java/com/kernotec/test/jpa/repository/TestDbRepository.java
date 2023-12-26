package com.kernotec.test.jpa.repository;

import com.kernotec.test.jpa.entity.TestDb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TestDbRepository extends JpaRepository<TestDb, UUID>  {
}
