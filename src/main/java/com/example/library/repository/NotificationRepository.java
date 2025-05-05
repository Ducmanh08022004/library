package com.example.library.repository;

import com.example.library.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByReaderUsernameAndIsReadFalse(String username);
}