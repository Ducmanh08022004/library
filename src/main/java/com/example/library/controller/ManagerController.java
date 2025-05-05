package com.example.library.controller;

import com.example.library.entity.Manager;
import com.example.library.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @GetMapping
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }

    @GetMapping("/{username}")
    public Optional<Manager> getManager(@PathVariable Long staffID) {
        return managerService.getManagerByStaffID(staffID);
    }

    @PostMapping
    public Manager createManager(@RequestBody Manager manager) {
        return managerService.saveManager(manager);
    }

    @PutMapping("/{username}")
    public Manager updateManager(@PathVariable String username, @RequestBody Manager manager) {
        manager.setUsername(username);
        return managerService.saveManager(manager);
    }

    @DeleteMapping("/{username}")
    public void deleteManager(@PathVariable String username) {
        managerService.deleteManager(username);
    }
}