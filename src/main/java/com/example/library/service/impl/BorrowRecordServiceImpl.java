package com.example.library.service.impl;

import com.example.library.entity.BorrowRecord;
import com.example.library.repository.BorrowRecordRepository;
import com.example.library.service.BorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BorrowRecordServiceImpl implements BorrowRecordService {
    BorrowRecordRepository borrowRecordRepository;
    @Autowired
    public BorrowRecordServiceImpl(BorrowRecordRepository borrowRecordRepository)
    {
        this.borrowRecordRepository=borrowRecordRepository;
    }

    public List<BorrowRecord> getAllBorrowRecords() {
        return borrowRecordRepository.findAll();
    }

    public List<BorrowRecord> getByUsername(String username) {
        return borrowRecordRepository.findByReader_Username(username);
    }

    public List<BorrowRecord> getUnreturnedBooks() {
        return borrowRecordRepository.findByReturnDateIsNull();
    }

    public BorrowRecord saveBorrowRecord(BorrowRecord record) {
        return borrowRecordRepository.save(record);
    }

    public void returnBook(Long recordId) {
        BorrowRecord record = borrowRecordRepository.findById(recordId).orElse(null);
        if (record != null) {
            record.setReturnDate(LocalDate.now());
            borrowRecordRepository.save(record);
        }
    }
}