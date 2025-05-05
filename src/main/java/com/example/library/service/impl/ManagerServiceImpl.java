package com.example.library.service.impl;

import com.example.library.entity.Manager;
import com.example.library.repository.ManagerRepository;
import com.example.library.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }

    public Optional<Manager> getManagerByStaffID(Long staffID) {
        return managerRepository.findBystaffID(staffID);
    }

    public Manager saveManager(Manager manager) {
        return managerRepository.save(manager);
    }

    public void deleteManager(String username) {
        managerRepository.deleteById(username);
    }
}