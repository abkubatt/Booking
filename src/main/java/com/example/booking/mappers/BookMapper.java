package com.example.booking.mappers;

import com.example.booking.models.dto.BookDto;
import com.example.booking.models.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book bookDtoToBook(BookDto bookDto);

    BookDto bookToBookDto(Book book);

    List<Book> bookDtoListToBookList(List<BookDto> bookDtos);

    List<BookDto> bookListToBookDtoList(List<Book> books);

}
