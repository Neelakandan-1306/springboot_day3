package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.EmployeeEntity;


@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}
