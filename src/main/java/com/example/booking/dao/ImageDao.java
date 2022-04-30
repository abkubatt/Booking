package com.example.booking.dao;

import com.example.booking.models.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageDao extends JpaRepository<Image, Long > {

}
