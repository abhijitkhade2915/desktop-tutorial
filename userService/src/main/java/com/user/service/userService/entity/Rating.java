package com.user.service.userService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private int Id;

    private int hotelId;

    private int userId;

    private int rating;

    private String feedback;

    private Hotel hotel;

    
}
