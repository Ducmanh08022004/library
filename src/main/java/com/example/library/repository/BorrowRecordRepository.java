package com.example.library.repository;

import com.example.library.entity.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Long> {
    List<BorrowRecord> findByReader_Username(String username);
    List<BorrowRecord> findByReturnDateIsNull();
    List<BorrowRecord> findByDueDateBetween(Date start, Date end);
}
