package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationID;

    private String message;
    private LocalDateTime createdAt;
    private boolean isRead;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;

    public void markAsRead() {
        this.isRead = true;
    }
}