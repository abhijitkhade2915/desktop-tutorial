package com.rating.service.ratingService.service;



import com.rating.service.ratingService.entity.Rating;

import java.util.List;
import java.util.Optional;


public interface RatingService {
    public Rating saveRating(Rating rating);

    public List<Rating> getAllRating();

    public List<Rating> getRatingByUserId (int userId);
    public List<Rating> getRatingByHotelId (int hotelId);

}
