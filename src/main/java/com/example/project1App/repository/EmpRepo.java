package com.example.project1App.repository;
import com.example.project1App.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository <Employee ,Integer> {

}
