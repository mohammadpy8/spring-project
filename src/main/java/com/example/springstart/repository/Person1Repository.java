package com.example.springstart.repository;

import com.example.springstart.model.Person1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Person1Repository extends JpaRepository<Person1, Long> {
}
