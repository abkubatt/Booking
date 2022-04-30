package com.example.booking.services.Impl;

import com.example.booking.dao.ConfRoomDao;
import com.example.booking.mappers.ConfRoomMapper;
import com.example.booking.models.dto.ConfRoomDto;
import com.example.booking.models.entities.ConfRoom;
import com.example.booking.services.ConfRoomService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ConfRoomServiceImpl implements ConfRoomService {
    @Autowired
    private ConfRoomDao confRoomDao;
    private ConfRoomMapper confRoomMapper = ConfRoomMapper.INSTANCE;
    @Override
    public ConfRoomDto save(ConfRoomDto confRoomDto) {
        ConfRoom confRoom = confRoomMapper.confRoomDtoToConfRoom(confRoomDto);
        confRoom.setActive(true);
        ConfRoom savedConfRoom = confRoomDao.save(confRoom);
        return confRoomMapper.confRoomToConfRoomDto(savedConfRoom);
    }

    @Override
    public ConfRoomDto findById(Long id) {
        ConfRoom confRoom = confRoomDao.findById(id).orElse(null);
        return confRoomMapper.confRoomToConfRoomDto(confRoom);
    }

    @Override
    public ConfRoomDto update(ConfRoomDto confRoomDto) {
        return null;
    }

    @Override
    public ConfRoomDto delete(ConfRoomDto confRoomDto) {
        return null;
    }

    @Override
    public List<ConfRoomDto> findAllByActive() {
        List<ConfRoom> confRooms = confRoomDao.findAllByActiveTrue();
        return confRoomMapper.confRoomListToConfRoomDtoList(confRooms);
    }
}
