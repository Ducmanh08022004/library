package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Manager {

    @Id // Đánh dấu staffID là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long staffID;

    private String username;
    private String password;
    private String role;
    private String fullname;
}
