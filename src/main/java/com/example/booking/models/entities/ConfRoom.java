package com.example.booking.models.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_confroom")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ConfRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    int capacity;
    boolean isActive;
    String description;
    boolean projector;
    boolean conditioner;
    boolean board;

}
