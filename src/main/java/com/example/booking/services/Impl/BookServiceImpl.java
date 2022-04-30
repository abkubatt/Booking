package com.example.booking.services.Impl;

import com.example.booking.dao.BookDao;
import com.example.booking.mappers.BookMapper;
import com.example.booking.models.dto.BookDto;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.Book;
import com.example.booking.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    private BookMapper bookMapper = BookMapper.INSTANCE;
    @Override
    public BookDto save(BookDto bookDto) {
        Book book = bookMapper.bookDtoToBook(bookDto);
        book.setActive(true);
        Book savedBook = bookDao.save(book);
        return bookMapper.bookToBookDto(savedBook);
    }

    @Override
    public BookDto findById(Long id) {
        Book book = bookDao.findById(id).orElse(null);
        return bookMapper.bookToBookDto(book);
    }

    @Override
    public BookDto update(BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto delete(BookDto bookDto) {
        return null;
    }

    @Override
    public List<BookDto> findAllByConfRoom(ConfRoomDto confRoomDto) {
        List<Book> books = bookDao.findAllByConfRoom(confRoomDto.getId());
        return bookMapper.bookListToBookDtoList(books);
    }
}
