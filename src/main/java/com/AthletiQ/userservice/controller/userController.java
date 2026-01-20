package com.AthletiQ.userservice.controller;

import com.AthletiQ.userservice.dto.RegisterRequest;
import com.AthletiQ.userservice.dto.UserResponse;
import com.AthletiQ.userservice.service.userService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userController")
@AllArgsConstructor
public class userController
{
    private userService UserService;
    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(UserService.register(request));
    }
    @GetMapping("/{userid}")
    public UserResponse getUserById (@PathVariable String userid)
    {

        return UserService.getUserByIdService(userid);
    }
}
