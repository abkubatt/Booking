package com.example.booking.dao;

import com.example.booking.models.dto.BookDto;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImageDao extends JpaRepository<Image, Long > {

    @Query(value = "select * from tb_confroom tc where tc.confroom_id ?1 and tc.is_active = true", nativeQuery = true)
    List<Image> findAllByConfRoom(Long confRoomId);

}
