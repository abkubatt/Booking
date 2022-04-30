package com.example.booking.controllers;

import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.dto.DepartmentDto;
import com.example.booking.models.dto.ImageDto;
import com.example.booking.services.ConfRoomService;
import com.example.booking.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/image")
public class ImageController {
    @Autowired
    private ImageService imageService;
    @Autowired
    private ConfRoomService confRoomService;

    @PostMapping("/save")
    public ImageDto save(@RequestBody ImageDto imageDto){
        return imageService.save(imageDto);
    }
    @GetMapping("/findById")
    public ImageDto findById(@RequestParam Long id){
        return imageService.findById(id);
    }

    @GetMapping("findAllByConfRoom")
    public List<ImageDto> findAllByConfRoom(@RequestParam Long confRoomId){
        ConfRoomDto confRoomDto = confRoomService.findById(confRoomId);
        return imageService.findAllByConfRoom(confRoomDto);
    }

}
