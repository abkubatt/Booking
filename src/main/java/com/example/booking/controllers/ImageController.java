package com.example.booking.controllers;

import com.example.booking.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/image")
public class ImageController {
    @Autowired
    private ImageService imageService;
}
