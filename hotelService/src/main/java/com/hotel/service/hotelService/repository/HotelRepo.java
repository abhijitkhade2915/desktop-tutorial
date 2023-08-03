package com.hotel.service.hotelService.repository;

import com.hotel.service.hotelService.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepo extends JpaRepository<Hotel,Integer> {
}
