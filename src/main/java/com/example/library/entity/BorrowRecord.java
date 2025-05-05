package com.example.library.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BorrowRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate borrowDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate returnDate;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name = "reader_id")
    private Reader reader;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;
    public boolean hasReturned() {
        return returnDate != null;
    }

    public int getRemainingDay() {
        if (returnDate != null) return 0;
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), dueDate);
    }
}