package com.hotel.service.hotelService.service;


import com.hotel.service.hotelService.entity.Hotel;

import java.util.List;


public interface HotelService {
    public Hotel saveHotel(Hotel hotel);

    public List<Hotel> getAllHotel();

    public Hotel getHotel (int HotelId);

}
