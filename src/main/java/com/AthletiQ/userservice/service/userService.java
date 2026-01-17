package com.AthletiQ.userservice.service;

import com.AthletiQ.userservice.Repository.UserRepository;
import com.AthletiQ.userservice.dto.RegisterRequest;
import com.AthletiQ.userservice.dto.UserResponse;
import com.AthletiQ.userservice.modal.User;
import org.springframework.stereotype.Service;
@Service
public class userService {

    private UserRepository repository;
    public UserResponse register(RegisterRequest request)
    {
        if (repository.existsByEmail(request.getEmail()))
        {
            throw new RuntimeException("Email Exists for this user");
        }
        User user=new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastname());
        User savedUser=new User();
        UserResponse userResponse=new UserResponse();
        userResponse.setId(savedUser.getId());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setEmail(savedUser.getEmail());
        userResponse.setPassword(savedUser.getPassword());
        userResponse.setFirstName(savedUser.getFirstName());
        userResponse.setLastName(savedUser.getLastName());
        userResponse.setCreatedAt(savedUser.getCreatedAt());
        userResponse.setUpdatedAt(savedUser.getUpdatedAt());
        return userResponse;
    }
//57:47
}
