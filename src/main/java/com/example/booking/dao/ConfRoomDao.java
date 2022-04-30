package com.example.booking.dao;

import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.ConfRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConfRoomDao extends JpaRepository<ConfRoom, Long> {

    List<ConfRoom> findAllByActiveTrue();

}
