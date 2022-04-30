package com.example.booking.services;

import com.example.booking.models.dto.ConfRoomDto;

public interface ConfRoomService {

    ConfRoomDto save(ConfRoomDto confRoomDto);

    ConfRoomDto findById(Long id);

    ConfRoomDto update(ConfRoomDto confRoomDto);

    ConfRoomDto delete(ConfRoomDto confRoomDto);
}
