package com.example.booking.dao;

import com.example.booking.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book, Long> {

}
