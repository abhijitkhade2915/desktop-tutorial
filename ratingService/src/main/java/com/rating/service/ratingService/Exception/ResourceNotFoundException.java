package com.rating.service.ratingService.Exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resourse not fount on server!!!");
    }

    public  ResourceNotFoundException(String message){
        super(message);
    }
}
