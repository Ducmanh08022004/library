package com.example.library.repository;

import com.example.library.entity.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ReaderRepository extends JpaRepository<Reader, String> {
    Optional<Reader> findByEmail(String email);

    Optional<Reader> findByUsername(String username);
}