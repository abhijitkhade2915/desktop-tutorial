package com.hotel.service.hotelService.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(){
        super("Resourse not fount on server!!!");
    }

    public  ResourceNotFoundException(String message){
        super(message);
    }
}
