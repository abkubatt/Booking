package com.example.booking.services.Impl;

import com.example.booking.dao.DepartmentDao;
import com.example.booking.mappers.DepartmentMapper;
import com.example.booking.models.dto.DepartmentDto;
import com.example.booking.models.entities.Department;
import com.example.booking.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    private DepartmentMapper departmentMapper = DepartmentMapper.INSTANCE;

    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        Department department = departmentMapper.departmentDtoToDepartment(departmentDto);
        department.setActive(true);
        Department savedDepartment = departmentDao.save(department);
        return departmentMapper.departmentToDepartmentDto(savedDepartment);
    }

    @Override
    public DepartmentDto findById(Long id) {
        Department department = departmentDao.findById(id).orElse(null);
        return departmentMapper.departmentToDepartmentDto(department);
    }

    @Override
    public DepartmentDto update(DepartmentDto departmentDto) {
        return null;
    }

    @Override
    public DepartmentDto delete(DepartmentDto departmentDto) {
        return null;
    }

    @Override
    public List<DepartmentDto> findAllByActive() {
        List<Department> departments = departmentDao.findAllByActiveTrue();
        return departmentMapper.departmentListToDepartmentDtoList(departments);
    }
}
