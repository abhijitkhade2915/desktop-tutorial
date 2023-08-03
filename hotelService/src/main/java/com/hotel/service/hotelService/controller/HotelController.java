package com.hotel.service.hotelService.controller;

import com.hotel.service.hotelService.entity.Hotel;
import com.hotel.service.hotelService.service.HotelService;
import com.hotel.service.hotelService.serviceImpl.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hotels")
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelService;
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        Hotel hotel1 = hotelService.saveHotel(hotel);

        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);

    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable int hotelId) {
       Hotel hotel1= hotelService.getHotel(hotelId);
        return ResponseEntity.ok(hotel1);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> hotel1 = hotelService.getAllHotel();
        return ResponseEntity.ok(hotel1);

    }
}
