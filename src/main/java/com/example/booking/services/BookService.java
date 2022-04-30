package com.example.booking.services;


import com.example.booking.models.dto.BookDto;
import com.example.booking.models.dto.ConfRoomDto;

import java.util.List;

public interface BookService {

    BookDto save(BookDto bookDto);

    BookDto findById(Long id);

    BookDto update(BookDto bookDto);

    BookDto delete(BookDto bookDto);

    List<BookDto> findAllByConfRoom(ConfRoomDto confRoomDto);

}
