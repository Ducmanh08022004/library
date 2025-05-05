package com.example.library.service.impl;

import com.example.library.entity.Reader;
import com.example.library.repository.ReaderRepository;
import com.example.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReaderServiceImpl implements ReaderService {

    @Autowired
    private ReaderRepository readerRepository;

    public List<Reader> getAllReaders() {
        return readerRepository.findAll();
    }

    public Optional<Reader> getReaderByUsername(String username) {
        return readerRepository.findByUsername(username);
    }

    public Reader saveReader(Reader reader) {
        return readerRepository.save(reader);
    }

    public void deleteReader(String username) {
        readerRepository.deleteById(username);
    }
}