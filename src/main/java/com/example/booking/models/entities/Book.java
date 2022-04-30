package com.example.booking.models.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "tb_book")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "confroom_id")
    ConfRoom confRoom;
    LocalTime startTime;
    LocalTime endTime;
    LocalDate date;
    String FIO;
    @ManyToOne
    @JoinColumn(name = "department_id")
    Department department;
    boolean isActive;

}
