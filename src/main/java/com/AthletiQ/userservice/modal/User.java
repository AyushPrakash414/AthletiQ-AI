package com.AthletiQ.userservice.modal;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table (name="users")    // used save the table name in the data base
@Data
public class User
{
    @Id  // is to tell the JPA/Hibernate  this the primary key
    @GeneratedValue (strategy = GenerationType.UUID) //used to auto generate the the id (Universally Unique Identifier) is a 128-bit unique value
    private String id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String email;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private UserRole role=UserRole.USER;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
