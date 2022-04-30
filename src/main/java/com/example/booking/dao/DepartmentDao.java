package com.example.booking.dao;

import com.example.booking.models.dto.DepartmentDto;
import com.example.booking.models.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentDao extends JpaRepository<Department, Long> {

    @Query("select d from Department d where d.isActive = true")
    List<Department> findAllByActiveTrue();

}
