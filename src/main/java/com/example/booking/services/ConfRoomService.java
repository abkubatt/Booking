package com.example.booking.services;

import com.example.booking.models.dto.ConfRoomDto;

import java.util.List;

public interface ConfRoomService {

    ConfRoomDto save(ConfRoomDto confRoomDto);

    ConfRoomDto findById(Long id);

    ConfRoomDto update(ConfRoomDto confRoomDto);

    ConfRoomDto delete(ConfRoomDto confRoomDto);

     List<ConfRoomDto> findAllByActive();

     List<ConfRoomDto> filer(int amoundPerson, boolean projector, boolean conditioner, boolean board);
}
