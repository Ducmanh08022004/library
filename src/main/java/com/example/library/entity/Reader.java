package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "username")
public class Reader extends User {

    private Long readerId;

    private String email;
    private String phoneNumber;

    @OneToMany(mappedBy = "reader", cascade = CascadeType.ALL)
    private List<BorrowRecord> borrowRecords;

    @OneToMany(mappedBy = "reader", cascade = CascadeType.ALL)
    private List<Notification> notifications;
}
