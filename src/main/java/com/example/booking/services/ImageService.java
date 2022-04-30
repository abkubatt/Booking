package com.example.booking.services;

import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.dto.ImageDto;

import java.util.List;

public interface ImageService {

    ImageDto save(ImageDto imageDto);

    ImageDto findById(Long id);

    ImageDto update(ImageDto imageDto);

    ImageDto delete(ImageDto imageDto);

    List<ImageDto> findAllByConfRoom(ConfRoomDto confRoomDto);
}
