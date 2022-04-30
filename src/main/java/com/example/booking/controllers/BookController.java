package com.example.booking.controllers;

import com.example.booking.models.dto.BookDto;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.json.BookSaveResponse;
import com.example.booking.services.BookService;
import com.example.booking.services.ConfRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private ConfRoomService confRoomService;

    @PostMapping("/save")
    public BookSaveResponse save(@RequestBody BookDto bookDto){
        return bookService.save(bookDto);
    }

    @GetMapping("/getById")
    public BookDto findById(@RequestParam Long id){
        return bookService.findById(id);
    }
    @GetMapping("/findAllByConfRoom")
    public List<BookDto> findAllByConfRoom(@RequestParam Long confRoomDtoId){
        ConfRoomDto confRoomDto = confRoomService.findById(confRoomDtoId);
        return bookService.findAllByConfRoom(confRoomDto);
    }

}
