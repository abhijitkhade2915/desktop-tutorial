package com.user.service.userService.serviceimpl;

import com.user.service.userService.Service.UserService;
import com.user.service.userService.entity.Hotel;
import com.user.service.userService.entity.Rating;
import com.user.service.userService.entity.User;
import com.user.service.userService.exception.ResourceNotFoundException;
import com.user.service.userService.repository.UserRepo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(int userId) {
        User user = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("user not found for a given id" + userId));

        //fetch rating of above user from rating service using RestTemplate
        //http://localhost:8083/ratings/user/userId
        Rating[] ratingsOfUser = restTemplate.getForObject("http://localhost:8083/ratings/user/" + userId, Rating[].class);
        log.info("ratingsOfUser" + ratingsOfUser);

        List<Rating> ratings = Arrays.stream(ratingsOfUser).toList();

        //api call to hotelService to get hotel
        List<Rating> ratingList = ratings.stream().map(rating -> {
            Hotel hotel = restTemplate.getForObject("http://localhost:8082/Hotels/"+rating.getHotelId(), Hotel.class);
            rating.setHotel(hotel);
            return rating;
        }).collect(Collectors.toList());

       //set hotel to rating
        user.setRatings(ratings);
        return user;
    }
}
