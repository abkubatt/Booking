package com.example.booking.services.Impl;

import com.example.booking.dao.ImageDao;
import com.example.booking.mappers.ImageMapper;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.dto.ImageDto;
import com.example.booking.models.entities.Image;
import com.example.booking.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImageServiceImpl implements ImageService
{
    @Autowired
    private ImageDao imageDao;

    private ImageMapper imageMapper = ImageMapper.INSTANCE;
    @Override
    public ImageDto save(ImageDto imageDto) {
        Image image = imageMapper.imageDtoToImage(imageDto);
        image.setActive(true);
        Image savedImage = imageDao.save(image);
        return imageMapper.imageToImageDto(savedImage);
    }

    @Override
    public ImageDto findById(Long id) {
        Image image = imageDao.findById(id).orElse(null);
        return imageMapper.imageToImageDto(image);
    }

    @Override
    public ImageDto update(ImageDto imageDto) {
        return null;
    }

    @Override
    public ImageDto delete(ImageDto imageDto) {
        return null;
    }

    @Override
    public List<ImageDto> findAllByConfRoom(ConfRoomDto confRoomDto) {
        List<Image> images = imageDao.findAllByConfRoom(confRoomDto.getId());
        return imageMapper.imageListToImageDtoList(images);
    }
}
