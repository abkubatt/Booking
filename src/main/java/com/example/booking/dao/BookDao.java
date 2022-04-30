package com.example.booking.dao;

import com.example.booking.models.dto.BookDto;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookDao extends JpaRepository<Book, Long> {

    @Query(value = "select * from tb_book tb where tb.confroom_id = ?1 and tb.is_active = true", nativeQuery = true)
    List<Book> findAllByConfRoom(Long confRoomId);

}
