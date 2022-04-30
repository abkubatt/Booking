package com.example.booking.dao;

import com.example.booking.models.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentDao extends JpaRepository<Department, Long> {
}
