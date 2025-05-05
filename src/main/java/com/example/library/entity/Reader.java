package com.example.library.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reader {

    @Id // Đánh dấu readerId là khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long readerId;

    private String username;
    private String password;
    private String role;
    private String fullname;

    private String email;
    private String phoneNumber;

    @OneToMany(mappedBy = "reader")
    @JsonIgnore
    private List<BorrowRecord> borrowRecords;

    @OneToMany(mappedBy = "reader", cascade = CascadeType.ALL)
    private List<Notification> notifications;
}
