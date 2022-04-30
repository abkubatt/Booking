package com.example.booking.mappers;

import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.ConfRoom;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ConfRoomMapper {
    ConfRoomMapper INSTANCE = Mappers.getMapper(ConfRoomMapper.class);

    ConfRoom confRoomDtoToConfRoom(ConfRoomDto confRoomDto);

    ConfRoomDto confRoomToConfRoomDto(ConfRoom confRoom);

    List<ConfRoom> confRoomDtoListToConfRoomList(List<ConfRoomDto> confRoomDtos);

    List<ConfRoomDto> confRoomListToConfRoomDtoList(List<ConfRoom> confRooms);

}
