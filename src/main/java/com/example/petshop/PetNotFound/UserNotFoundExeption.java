package com.example.petshop.PetNotFound;

public class UserNotFoundExeption extends RuntimeException{
    public UserNotFoundExeption(String message){
        super(message);
    }
}
