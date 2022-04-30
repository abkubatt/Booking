package com.example.booking.models.dto;

import com.example.booking.models.entities.ConfRoom;
import com.example.booking.models.entities.Department;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.sql.Time;

@Data
public class BookDto {
    Long id;
    ConfRoom confRoom;
    Time StartTime;
    Time EndTime;
    Date date;
    String FIO;
    Department department;
    boolean isActive;
}
