package com.example.booking.services;

import com.example.booking.dao.ImageDao;
import com.example.booking.models.dto.ImageDto;
import com.example.booking.models.entities.Image;

public interface ImageService {

    ImageDto save(ImageDto imageDto);

    ImageDto findById(Long id);

    ImageDto update(ImageDto imageDto);

    ImageDto delete(ImageDto imageDto);
}
