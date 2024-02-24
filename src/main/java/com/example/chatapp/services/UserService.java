package com.example.chatapp.services;

import com.example.chatapp.models.User;
import com.example.chatapp.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers(){
        List<User> allUsers = new ArrayList<>();
        try{
            System.out.println(userRepository.findAll().toString());
            allUsers = userRepository.findAll();
        }catch (Exception e){
            System.out.println("Failed to catch all products: " + e.getMessage());
        }
        return allUsers;
    }


    public Optional<User> getSingleUser(String Id){
        return userRepository.findUserById(Id);
    }

    public boolean deleteUser(String Id){
        userRepository.deleteById(Long.parseLong(Id));
        return true;
    }




}
