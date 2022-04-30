package com.example.booking.services.Impl;

import com.example.booking.dao.BookDao;
import com.example.booking.mappers.BookMapper;
import com.example.booking.models.dto.BookDto;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.Book;
import com.example.booking.models.json.BookSaveResponse;
import com.example.booking.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    private BookMapper bookMapper = BookMapper.INSTANCE;
    @Override
    public BookSaveResponse save(BookDto bookDto) {
        BookSaveResponse bookSaveResponse = new BookSaveResponse();
//        String patternDate = "yyyy-MM-dd";
//        String patternTime = "yyyy-MM-dd HH:mm:ss";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternDate);
//        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat(patternTime);
//
//        String date = simpleDateFormat.format(convertToDateViaInstant(bookDto.getDate()));
//        String startTime = simpleTimeFormat.format(convertToDateViaInstant(bookDto.getStartTime()));
//        String endTime = simpleTimeFormat.format(convertToDateViaInstant(bookDto.getEndTime()));


        List<Book> isExists = bookDao.findAllByConfRoomIdAndDateAndStartTimeAndEndTime(bookDto.getConfRoom().getId(), bookDto.getDate(), bookDto.getStartTime(), bookDto.getEndTime());

        if(!isExists.isEmpty()){
            bookSaveResponse.setStatus(0);
            bookSaveResponse.setMessage("Room is busy");
            return bookSaveResponse;
        }
        Book book = bookMapper.bookDtoToBook(bookDto);
        book.setActive(true);
        Book savedBook = bookDao.save(book);
        if(savedBook != null){
            bookSaveResponse.setStatus(1);
            bookSaveResponse.setMessage("Success");
            return bookSaveResponse;
        }
        bookSaveResponse.setStatus(0);
        bookSaveResponse.setMessage("Error in saving");
        return bookSaveResponse;

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
    private Date convertToDateViaInstant(LocalDate dateToConvert) {
        return java.util.Date.from(dateToConvert.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }
    private Date convertToDateViaInstant(LocalDateTime dateToConvert) {
        return java.util.Date
                .from(dateToConvert.atZone(ZoneId.systemDefault())
                        .toInstant());
    }
}

