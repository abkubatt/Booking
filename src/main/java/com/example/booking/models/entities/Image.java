package com.example.booking.models.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tb_image")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String link;
    @ManyToOne
    @JoinColumn(name = "confroom_id")
    ConfRoom confRoom;
    int orderNum;
    boolean isActive;

}
