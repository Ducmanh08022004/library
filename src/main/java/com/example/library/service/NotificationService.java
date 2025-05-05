package com.example.library.service;

import com.example.library.entity.Notification;
import java.util.List;

public interface NotificationService {
    List<Notification> getUnreadNotifications(String readerUsername);
    Notification saveNotification(Notification notification);
    void markAsRead(Long notificationId);
}