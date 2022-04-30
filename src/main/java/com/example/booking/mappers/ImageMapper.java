package com.example.booking.mappers;

import com.example.booking.models.dto.ImageDto;
import com.example.booking.models.entities.Image;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper

public interface ImageMapper {

    ImageMapper INSTANCE = Mappers.getMapper(ImageMapper.class);

    Image imageDtoToImage(ImageDto imageDto);

    ImageDto imageToImageDto(Image image);

    List<Image> imageDtoListToImageList(List<ImageDto> imageDtos);

    List<ImageDto> imageListToImageDtoList(List<Image> images);
}
