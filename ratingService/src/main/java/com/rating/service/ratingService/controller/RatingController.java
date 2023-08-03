package com.rating.service.ratingService.controller;

import com.rating.service.ratingService.entity.Rating;
import com.rating.service.ratingService.serviceImpl.RatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {
    @Autowired
    private RatingServiceImpl ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
        Rating rating1 = ratingService.saveRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);

    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable int userId) {
        List<Rating> rating1 = ratingService.getRatingByUserId(userId);
        return ResponseEntity.ok(rating1);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Rating>> getAllRatings() {
        List<Rating> rating1 = ratingService.getAllRating();
        return ResponseEntity.ok(rating1);

    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable int hotelId) {
        List<Rating> rating1 = ratingService.getRatingByHotelId(hotelId);
        return ResponseEntity.ok(rating1);
    }
}
