package com.example.booking.controllers;

import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.dto.DepartmentDto;
import com.example.booking.services.ConfRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/confroom")
public class ConfRoomController {
    @Autowired
    private ConfRoomService confRoomService;

    @PostMapping("/save")
    public ConfRoomDto save(@RequestBody ConfRoomDto confRoomDto){
        return confRoomService.save(confRoomDto);
    }
    @GetMapping("/findById")
    public ConfRoomDto findById(@RequestParam Long id){
        return confRoomService.findById(id);
    }
    @PostMapping("findAllByActive")
    public List<ConfRoomDto> findAllByActive(){
        return confRoomService.findAllByActive();
    }
}
