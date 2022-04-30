package com.example.booking.models.dto;

import lombok.Data;

@Data
public class ConfRoomDto {
    Long id;
    String name;
    int capacity;
    boolean isActive;
    String description;
    boolean projector;
    boolean conditioner;
    boolean board;
}
