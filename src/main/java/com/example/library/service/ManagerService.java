package com.example.library.service;

import com.example.library.entity.Manager;
import java.util.List;
import java.util.Optional;

public interface ManagerService {
    List<Manager> getAllManagers();
    Optional<Manager> getManagerByStaffID(Long staffID);
    Manager saveManager(Manager manager);
    void deleteManager(String username);
}