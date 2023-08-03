package com.rating.service.ratingService.repository;

import com.rating.service.ratingService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RatingRepo extends JpaRepository<Rating,Integer> {

  public List<Rating> findByUserId(int userId);

  public List<Rating> findByHotelId(int hotelId);
}
