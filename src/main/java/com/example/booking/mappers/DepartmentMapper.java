package com.example.booking.mappers;

import com.example.booking.models.dto.DepartmentDto;
import com.example.booking.models.entities.Department;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    Department departmentDtoToDepartment(DepartmentDto departmentDto);

    DepartmentDto departmentToDepartmentDto(Department department);

    List<Department> departmentDtoListToDepartmentList(List<DepartmentDto> departmentDtos);

    List<DepartmentDto> departmentListToDepartmentDtoList(List<Department> departments);
}
