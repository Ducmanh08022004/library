package com.example.library.service;

import com.example.library.entity.Reader;
import java.util.List;
import java.util.Optional;

public interface ReaderService {
    List<Reader> getAllReaders();
    Optional<Reader> getReaderByUsername(String username);
    Reader saveReader(Reader reader);
    void deleteReader(String username);
}