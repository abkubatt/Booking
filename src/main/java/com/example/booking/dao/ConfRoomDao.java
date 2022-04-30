package com.example.booking.dao;

import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.ConfRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ConfRoomDao extends JpaRepository<ConfRoom, Long> {


    @Query("select c from ConfRoom c where c.isActive = true")
    List<ConfRoom> findAllByActiveTrue();

}
