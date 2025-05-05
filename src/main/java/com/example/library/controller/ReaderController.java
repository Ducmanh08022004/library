package com.example.library.controller;

import com.example.library.entity.Reader;
import com.example.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/readers")
public class ReaderController {

    @Autowired
    private ReaderService readerService;

    @GetMapping
    public List<Reader> getAllReaders() {
        return readerService.getAllReaders();
    }

    @GetMapping("/{username}")
    public Optional<Reader> getReader(@PathVariable String username) {
        return readerService.getReaderByUsername(username);
    }

    @PostMapping
    public Reader createReader(@RequestBody Reader reader) {
        return readerService.saveReader(reader);
    }

    @PutMapping("/{username}")
    public Reader updateReader(@PathVariable String username, @RequestBody Reader reader) {
        reader.setUsername(username);
        return readerService.saveReader(reader);
    }

    @DeleteMapping("/{username}")
    public void deleteReader(@PathVariable String username) {
        readerService.deleteReader(username);
    }
}