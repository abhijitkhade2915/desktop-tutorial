package com.rating.service.ratingService.serviceImpl;


import com.rating.service.ratingService.entity.Rating;
import com.rating.service.ratingService.repository.RatingRepo;
import com.rating.service.ratingService.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public Rating saveRating(Rating rating) {
        return ratingRepo.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepo.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(int userId) {
        return ratingRepo.findByUserId(userId);//orElseThrow(()->new ResourceNotFoundException("Resource not found of given id"+userId));
    }
    @Override
    public List<Rating> getRatingByHotelId(int hotelId) {
        return ratingRepo.findByHotelId(hotelId);//orElseThrow(()->new ResourceNotFoundException("Resource not found of given id"+hotelId));
    }
}
