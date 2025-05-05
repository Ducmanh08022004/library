package com.example.library.service;

import com.example.library.entity.BorrowRecord;
import java.util.List;

public interface BorrowRecordService {
    List<BorrowRecord> getAllBorrowRecords();
    List<BorrowRecord> getByUsername(String username);
    List<BorrowRecord> getUnreturnedBooks();
    BorrowRecord saveBorrowRecord(BorrowRecord record);
    void returnBook(Long recordId);

}