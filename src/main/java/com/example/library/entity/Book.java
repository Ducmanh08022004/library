package com.example.library.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookID;
    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<BorrowRecord> borrowRecords;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int availableCopies;
}