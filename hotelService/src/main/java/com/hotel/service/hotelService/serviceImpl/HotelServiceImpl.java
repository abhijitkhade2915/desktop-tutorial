package com.hotel.service.hotelService.serviceImpl;

import com.hotel.service.hotelService.entity.Hotel;
import com.hotel.service.hotelService.exception.ResourceNotFoundException;
import com.hotel.service.hotelService.repository.HotelRepo;
import com.hotel.service.hotelService.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel saveHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getHotel(int hotelId) {
        return hotelRepo.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("hotel not found for a given id"+hotelId));
    }
}
