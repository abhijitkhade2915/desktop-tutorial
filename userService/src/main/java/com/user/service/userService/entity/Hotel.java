package com.user.service.userService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private int hotelId;

    private String hotelName;

    private String location;

    private String about;

}
