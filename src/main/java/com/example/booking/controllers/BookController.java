package com.example.booking.controllers;

import com.example.booking.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/book")
public class BookController {
    @Autowired
    private BookService bookService;

}
