package com.example.booking.dao;

import com.example.booking.models.dto.DepartmentDto;
import com.example.booking.models.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentDao extends JpaRepository<Department, Long> {
    List<Department> findAllByActiveTrue();

}
