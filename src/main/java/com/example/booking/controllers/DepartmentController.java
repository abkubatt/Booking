package com.example.booking.controllers;

import com.example.booking.models.dto.DepartmentDto;
import com.example.booking.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public DepartmentDto save(@RequestBody DepartmentDto departmentDto){
        return departmentService.save(departmentDto);
    }

    @GetMapping("/findById")
    public DepartmentDto findById(@RequestParam Long id){
        return departmentService.findById(id);
    }

    @PostMapping("findAllByActive")
    public List<DepartmentDto> findAllByActive(){
        return departmentService.findAllByActive();
    }

}
