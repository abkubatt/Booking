package com.example.booking.models.dto;

import com.example.booking.models.entities.ConfRoom;
import com.example.booking.models.entities.Department;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class BookDto {
    Long id;
    ConfRoom confRoom;
    @DateTimeFormat(pattern = "HH:mm")
    LocalTime startTime;
    @DateTimeFormat(pattern = "HH:mm")
    LocalTime endTime;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDate date;
    String FIO;
    Department department;
    boolean isActive;
}
