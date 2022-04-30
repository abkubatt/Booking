package com.example.booking.models.dto;

import com.example.booking.models.entities.ConfRoom;
import lombok.Data;

@Data
public class ImageDto {
    Long id;
    String link;
    ConfRoom confRoom;
    int orderNum;
    boolean isActive;
}
