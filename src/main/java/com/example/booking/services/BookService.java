package com.example.booking.services;


import com.example.booking.models.dto.BookDto;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.json.BookSaveResponse;

import java.util.List;

public interface BookService {

   BookSaveResponse save(BookDto bookDto);

    BookDto findById(Long id);

    BookDto update(BookDto bookDto);

    BookDto delete(BookDto bookDto);

    List<BookDto> findAllByConfRoom(ConfRoomDto confRoomDto);

}
