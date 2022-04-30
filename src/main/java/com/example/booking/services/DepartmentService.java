package com.example.booking.services;

import com.example.booking.dao.DepartmentDao;
import com.example.booking.models.dto.DepartmentDto;

public interface DepartmentService {

    DepartmentDto save(DepartmentDto departmentDto);

    DepartmentDto findById(Long id);

    DepartmentDto update(DepartmentDto departmentDto);

    DepartmentDto delete(DepartmentDto departmentDto);
}
