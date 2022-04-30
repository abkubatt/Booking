package com.example.booking.models.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

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
    Time StartTime;
    Time EndTime;
    Date date;
    String FIO;
    @ManyToOne
    @JoinColumn(name = "department_id")
    Department department;
    boolean isActive;

}
