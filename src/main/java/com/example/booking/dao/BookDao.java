package com.example.booking.dao;

import com.example.booking.models.dto.BookDto;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
@Repository
public interface BookDao extends JpaRepository<Book, Long> {

    @Query(value = "select * from tb_book tb where tb.confroom_id = ?1 and tb.is_active = true", nativeQuery = true)
    List<Book> findAllByConfRoom(Long confRoomId);




    @Query(value = "select * from tb_book  b where b.confroom_id = ?1 and b.date = TO_TIME(?2) and (b.start_time = ?3 or b.end_time = ?4 )", nativeQuery = true)
    List<Book> existsAllByConfRoomAndDate(Long confRoomId, String date, String startTime, String endTime);

    List<Book> findAllByConfRoomIdAndDateAndStartTimeAndEndTime(Long confRoomId, LocalDate date, LocalTime startTime, LocalTime endTime);
}
