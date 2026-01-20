package com.AthletiQ.userservice.service;

import com.AthletiQ.userservice.Repository.UserRepository;
import com.AthletiQ.userservice.dto.RegisterRequest;
import com.AthletiQ.userservice.dto.UserResponse;
import com.AthletiQ.userservice.modal.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Data
public class userService {
    @Autowired
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
        User savedUser=repository.save(user);
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
    public UserResponse getUserByIdService(String id)
    {
        User user=repository.findById(id)
                .orElseThrow(()->new RuntimeException("user Not found!!"));
        UserResponse userResponse=new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setEmail(user.getEmail());
        userResponse.setFirstName(user.getFirstName());
        userResponse.setLastName(user.getLastName());
        userResponse.setPassword(user.getPassword());
        userResponse.setCreatedAt(user.getCreatedAt());
        userResponse.setUpdatedAt(user.getUpdatedAt());
        return userResponse;
    }
}
