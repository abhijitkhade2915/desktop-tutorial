package com.user.service.userService.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resourse not fount on server!!!");
    }

    public  ResourceNotFoundException(String message){
        super(message);
    }
}
