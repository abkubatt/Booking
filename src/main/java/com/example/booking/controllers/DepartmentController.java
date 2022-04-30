package com.example.booking.controllers;

import com.example.booking.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
}
