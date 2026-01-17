package com.AthletiQ.userservice.dto;
import lombok.Data;
import java.time.LocalDateTime;
@Data
public class UserResponse {
        private String id;
        private String firstName;
        private String email;
        private String password;
        private String lastName;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
}
